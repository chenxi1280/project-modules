package com.qf.dao;

import com.qf.pojo.entity.OrderItem;
import com.qf.pojo.vo.FcOrderVO;
import com.qf.pojo.vo.OrderItemVO;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

public interface OrderItemDao {
    int deleteByPrimaryKey(Long orderId);

    int insert(OrderItem record);

    int insertSelective(OrderItem record);

    OrderItem selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(OrderItem record);

    int updateByPrimaryKey(OrderItem record);

    List<OrderItemVO> selectByOrders(@Param("oids") Collection list);
}