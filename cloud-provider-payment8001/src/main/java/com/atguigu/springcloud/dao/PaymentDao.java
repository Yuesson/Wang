package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author Yuesson
 * @date 2020-11-04-16:41-星期三
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPayment(@Param("id") Long id);

    @Select("select * from payment where id = #{id};")
    Payment getPaymentById(@Param("id") Long id);
}
