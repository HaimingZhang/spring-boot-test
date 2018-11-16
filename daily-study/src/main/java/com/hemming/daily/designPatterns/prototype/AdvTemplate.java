package com.hemming.daily.designPatterns.prototype;

/**
 * Created by hmzhang on 2018/10/18.
 */
public class AdvTemplate {
    private String advSubject = "XX公司抽奖活动";

    private String advContext = "你好幸运，抽到好奖！";

    public String getAdvSubject() {
        return this.advSubject;
    }

    public String getAdvContext() {
        return this.advContext;
    }
}
