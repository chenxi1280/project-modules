package com.qf.service;

import com.qf.pojo.query.UserQuery;
import com.qf.pojo.vo.FcOrderVO;

import java.util.List;

public interface FcOrderService {



    List<FcOrderVO> selectByUserQuery(UserQuery userQuery);
}
