package com.hemming.daily.designPatterns.chain;

public interface Verify {
    boolean doVerify() throws Exception;

    void setNextVerify(Verify verify);

    boolean logErrorMsg(String errorMsg) throws Exception;

    interface VerifyCallBack {
        void success();

        void fail() throws Exception;
    }
}
