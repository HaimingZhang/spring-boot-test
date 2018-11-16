package com.hemming.daily.designPatterns.prototype;

/**
 * Created by hmzhang on 2018/10/20.
 */
public class Client {
    private final static int MAX_COUNT = 6;

    public static void main(String[] args) {

        AdvTemplate advTemplate = new AdvTemplate();
        int count = 0;
        while (count < MAX_COUNT) {
            Mail mail = new Mail(advTemplate);
            mail = mail.clone();
            sendMail(mail);
            count++;
        }

    }

    private static void sendMail(Mail mail) {
        System.out.println("haah " + mail.getContext() + mail.getSubject() + "发送完成");
    }
}
