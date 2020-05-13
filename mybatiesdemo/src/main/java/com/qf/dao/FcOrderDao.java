package com.qf.dao;

import com.qf.pojo.entity.FcOrder;

public interface FcOrderDao {
    int deleteByPrimaryKey(Long orderId);

    int insert(FcOrder record);

    int insertSelective(FcOrder record);

    FcOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(FcOrder record);

    int updateByPrimaryKey(FcOrder record);
}