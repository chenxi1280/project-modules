package com.qf.dao;

import com.qf.pojo.entity.OrderItem;

public interface OrderItemDao {
    int deleteByPrimaryKey(Long orderId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);
}