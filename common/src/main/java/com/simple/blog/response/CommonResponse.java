package com.simple.blog.response;

import lombok.Getter;

@Getter
public class CommonResponse <T> {

    public final static CommonResponse SUCCESS = new CommonResponse<>(Result.SUCCESS, "OK", null);

    private Result result;
    private String message;
    private T data;

    public CommonResponse(Result result, String message, T data) {
        this.result = result;
        this.message = message;
        this.data = data;
    }

    private enum Result {
        SUCCESS, FAIL
    }

}
