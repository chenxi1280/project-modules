package com.qf.dao;

import com.qf.pojo.entity.Merchant;

public interface MerchantDao {
    int deleteByPrimaryKey(Long merchantId);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Long merchantId);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);
}