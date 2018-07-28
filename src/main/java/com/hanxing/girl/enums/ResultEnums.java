package com.hanxing.girl.enums;

public enum ResultEnums {
    UNKOWN_ERROR(-1, "未知错误"),
    SUCCESS(100, "你在上小学"),
    MIDDLE_SCHOLLE(200, "你在上中学"),
    PRIMARY_SCHOOL(100, "你在上小学");

    private Integer code;
    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

