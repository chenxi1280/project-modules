package com.qf.service.impl;

import com.qf.dao.FcOrderDao;
import com.qf.pojo.entity.FcOrder;
import com.qf.pojo.query.UserQuery;
import com.qf.pojo.vo.FcOrderVO;
import com.qf.service.FcOrderService;

import java.util.List;

public class FcOrderServiceImpl implements FcOrderService {
    private FcOrderDao fcOrderDao;


    public List<FcOrderVO> selectByUserQuery(UserQuery userQuery) {
        List<FcOrderVO> list = fcOrderDao.selectByUserQuery(userQuery);



        return null;
    }
}
