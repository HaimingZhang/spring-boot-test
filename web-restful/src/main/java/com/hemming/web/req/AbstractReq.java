package com.hemming.web.req;

import java.beans.Transient;

/**
 * @author zhm176353@alibaba-inc.com 2019-08-13 15:47
 */
public abstract class AbstractReq {

    /**
     * 是否需要打印请求日志
     *
     * @return
     */
    @Transient
    public boolean isPrintReqLog() {
        return false;
    }

    @Transient
    public boolean isPrintRespLog() {
        return false;
    }

    public void validate() {

    }
}
