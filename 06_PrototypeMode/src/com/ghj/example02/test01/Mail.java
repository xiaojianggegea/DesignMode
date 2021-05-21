package com.ghj.example02.test01;

/**
 * @program: 06_PrototypeMode
 * @description: 邮件类
 * @author: 小江
 * @create: 2021-05-21 16:01
 **/

public class Mail {
    private String receiver;
    private String subject;
    private String appellation;
    private String context;
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAbvContext();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
