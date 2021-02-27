package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Yuesson
 * @date 2020-11-04-17:07-星期三
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);

    Payment getPaymentById(Long id);
}
