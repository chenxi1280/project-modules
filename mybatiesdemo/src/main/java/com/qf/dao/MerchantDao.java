package com.qf.dao;

import com.qf.pojo.entity.Merchant;
import com.qf.pojo.query.MerchantQuery;
import com.qf.pojo.vo.MerchantVO;

import java.util.List;

public interface MerchantDao {
    int deleteByPrimaryKey(Long merchantId);

    int insert(Merchant record);

    int insertSelective(Merchant record);

    Merchant selectByPrimaryKey(Long merchantId);

    int updateByPrimaryKeySelective(Merchant record);

    int updateByPrimaryKey(Merchant record);

    List<MerchantVO> selectByName(MerchantQuery merchantQuery);

    List<MerchantVO> selectByTitle(MerchantQuery merchantQuery);
}