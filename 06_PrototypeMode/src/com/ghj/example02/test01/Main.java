package com.ghj.example02.test01;

import java.util.Random;

/**
 * @program: 06_PrototypeMode
 * @description: 场景类
 * @author: 小江
 * @create: 2021-05-21 16:03
 **/

public class Main {
    private static int MAX_COUNT = 3;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("中国银行版权所有");
        while (i < MAX_COUNT) {
            mail.setAppellation(getRandString(5) + "先生（女士）");
            mail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            sendMail(mail);
            i++;
        }
    }

    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject()+"\t发送内容："+mail.getContext()+"\t收件人："+mail.getAppellation()+"邮件地址："+ mail.getReceiver() + "\t...发送成功！");
    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
