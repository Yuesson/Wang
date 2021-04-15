package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Yuesson
 * @date 2020-11-04-16:30-星期三
 */
@Data
@AllArgsConstructor //全参构造方法
@NoArgsConstructor //空参构造方法
public class CommonResult<T> {
    //404 no_found

    private Integer code;
    private String message;
    private T       data;

    // 只有code 和 message  两个参数的构造方法
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}
