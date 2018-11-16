//package com.hemming.daily.designPatterns.chain;
//
//import me.ele.napos.openapi.goods.descriptor.exception.InvalidParameterException;
//
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class RegularVerify extends AbsVerify {
//    protected String regex = "[A-Za-z0-9]{34,36}";
//
//    public RegularVerify(String data, String errorMsg, String regex) {
//        super(data, errorMsg);
//        this.regex = regex;
//    }
//
//    @Override
//    public boolean doVerify() throws Exception {
//        return matcher() ? doNextFilter() : logErrorMsg(errorMsg);
//    }
//
//    @Override
//    public void setCallBack(VerifyCallBack callBack) {
//
//        super.setCallBack(callBack);
//    }
//
//    public void setDefaultFailCallBack() {
//        Verify.VerifyCallBack verifyCallBack = new Verify.VerifyCallBack() {
//            @Override
//            public void success() {
//
//            }
//
//            @Override
//            public void fail() throws Exception {
//                throw new InvalidParameterException(errorMsg);
//            }
//        };
//        setCallBack(verifyCallBack);
//    }
//
//
//    private boolean matcher() {
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(data);
//        return matcher.matches();
//    }
//}
