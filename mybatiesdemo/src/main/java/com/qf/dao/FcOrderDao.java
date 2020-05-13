package com.qf.dao;

import com.qf.pojo.entity.FcOrder;
import com.qf.pojo.query.UserQuery;
import com.qf.pojo.vo.FcOrderVO;

import java.util.List;

public interface FcOrderDao {
    int deleteByPrimaryKey(Long orderId);

    int insert(FcOrder record);

    int insertSelective(FcOrder record);

    FcOrder selectByPrimaryKey(Long orderId);

    int updateByPrimaryKeySelective(FcOrder record);

    int updateByPrimaryKey(FcOrder record);

    List<FcOrderVO> selectByUserQuery(UserQuery userQuery);
}