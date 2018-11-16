package com.hemming.daily.designPatterns.chain;


public abstract class AbsVerify implements Verify {
    protected String data;

    protected String errorMsg;

    protected Verify nextVerify;

    protected VerifyCallBack callBack;

    public AbsVerify(String data, String errorMsg) {
        this.data = data;
        this.errorMsg = errorMsg;
    }

    @Override
    public void setNextVerify(Verify verify) {
        this.nextVerify = verify;
    }

    @Override
    public boolean logErrorMsg(String errorMsg) throws Exception {
        if (callBack != null) {
            callBack.fail();
        }
        if (errorMsg != null) {
            System.out.println(errorMsg);
        }
        return false;
    }

    protected boolean doNextFilter() throws Exception {
        if (callBack != null) {
            callBack.success();
        }
        return nextVerify != null ? nextVerify.doVerify() : true;
    }

    public void setCallBack(VerifyCallBack callBack) {
        this.callBack = callBack;
    }

    public VerifyCallBack getCallBack() {
        return callBack;
    }
}
