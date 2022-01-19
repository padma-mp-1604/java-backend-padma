package com.weektwo.casestudy.weekbankrestapp.dto;

import java.util.Collection;

public class AppResponse<T> {

    private String sts;
    private String msg;
    private T body;

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }
}
