package com.imooc.sell.exception;


import com.imooc.sell.enums.ResultEnum;

/**
 * Created by 廖师兄
 * 2017-06-11 18:55
 */
public class SellException extends RuntimeException{

    private static final long serialVersionUID = 8693060936686487407L;
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
