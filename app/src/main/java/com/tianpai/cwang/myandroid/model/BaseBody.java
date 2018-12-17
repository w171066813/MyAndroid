package com.tianpai.cwang.myandroid.model;

/**
 * Created by cwang on 2018/11/30.
 */

public class BaseBody {
    private boolean isSuccess;
    private String message;
    private String body;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
