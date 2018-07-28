package com.hanxing.girl.utils;

import com.hanxing.girl.domain.Result;

public class ResultUtils {
    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
       return success(null);
    }

    public static Result error(int code,String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
