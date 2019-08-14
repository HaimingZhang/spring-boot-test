package com.hemming.web.aspect;

import com.alibaba.fastjson.JSON;
import com.hemming.web.req.AbstractReq;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StopWatch;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/**
 * @author zhm176353@alibaba-inc.com 2019-08-13 15:57
 */
@Aspect
@Component
public class ServiceAspect {

    private Logger logger = LoggerFactory.getLogger(ServiceAspect.class);
    private static Validator VALIDATOR = Validation.buildDefaultValidatorFactory().getValidator();
    private static ExecutableValidator EXECUTABLE_VALIDATOR = VALIDATOR.forExecutables();


    private static final AbstractReq DEFAULT_REQ = new AbstractReq() {
        @Override
        public boolean isPrintReqLog() {
            return false;
        }

        @Override
        public boolean isPrintRespLog() {
            return false;
        }
    };

    @Pointcut("execution(* com.hemming.web.controller.*Controller.*(..))")
    public void executeService() {

    }

    @Around("executeService()")
    public Object aroundServiceExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        AbstractReq req = DEFAULT_REQ;

        Object[] params = joinPoint.getArgs();

        if (params != null && params.length != 0) {
            for (Object param : params) {
                if (param instanceof AbstractReq) {
                    req = (AbstractReq)param;
                }
            }
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();

        Object resp = null;

        try {
            if (req.isPrintReqLog()) {
                logger.info("[{}] Recv:{}", getClassAndSignature(joinPoint), JSON.toJSONString(params));
            }

            validate(joinPoint, req);

            resp = joinPoint.proceed();

            return resp;
        } catch (IllegalArgumentException e) {
            logger.error("Invalid request: {},{}", req, e.getMessage(), e);
            throw new IllegalArgumentException("Invalid request", e);
        } finally {
            stopWatch.stop();
            String prettyPrint = stopWatch.prettyPrint();
            if (req.isPrintReqLog()) {
                logger.info("Resp:{}, consumed:{}ms", JSON.toJSONString(resp), prettyPrint);
            }
        }


    }

    private String getClassAndSignature(JoinPoint joinPoint) {
        return joinPoint.getTarget().getClass().getSimpleName() + "#" + joinPoint.getSignature().getName();
    }

    private void validate(ProceedingJoinPoint joinPoint, AbstractReq req) {
        Set<ConstraintViolation<Object>> violations = new HashSet<>();

        try {
            MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
            Method method = methodSignature.getMethod();
            violations.addAll(VALIDATOR.validate(req));
            violations.addAll(
                EXECUTABLE_VALIDATOR.validateParameters(joinPoint.getTarget(), method, joinPoint.getArgs()));
        } catch (Exception e) {
            //包住一切异常，不影响业务方法
            logger.error("validate method error,req:{}", req, e);
        }
        StringBuilder errorMsgs = new StringBuilder();
        if (violations.size() > 0) {
            for (ConstraintViolation violation : violations) {
                errorMsgs.append(violation.getPropertyPath()).append(":").append(violation.getMessage()).append("|");
            }
            throw new IllegalArgumentException(errorMsgs.substring(0, errorMsgs.length() - 1));
        }

        //自定义validate
        req.validate();
    }




}
