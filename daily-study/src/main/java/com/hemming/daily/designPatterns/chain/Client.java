//package com.hemming.daily.designPatterns.chain;
//
///**
// * Created by hmzhang on 2018/10/24.
// */
//public class Client {
//    protected static String regex = "[A-Za-z0-9]{34,36}";
//
//    public static void main(String[] args) throws Exception {
//        Verify.VerifyCallBack verifyCallBack = new Verify.VerifyCallBack() {
//            @Override
//            public void success() {
//
//            }
//
//            @Override
//            public void fail() {
//                throw new RuntimeException("图片hash不符合格式");
//            }
//        };
//
//        RegularVerify regularVerify = new RegularVerify("34e5c4d290ba6d2d019fd2ad2628c0a5xls", "正则判断", regex);
//        regularVerify.setCallBack(verifyCallBack);
//
//        RegularVerify regularVerify2 = new RegularVerify("2323", "正则判断", regex);
//        regularVerify2.setCallBack(verifyCallBack);
//
//        boolean verify = new VerifyManager()
//                .addVerify(regularVerify)
//                .addVerify(regularVerify2)
//                .execute();
//
//        System.out.println(verify);
//
//    }
//}
