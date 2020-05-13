package com.qf.service;

import com.qf.pojo.dto.ReulstData;
import com.qf.pojo.entity.FcOrder;
import com.qf.pojo.query.FcOrderQuery;
import com.qf.pojo.query.UserQuery;
import com.qf.pojo.vo.FcOrderVO;

import java.util.List;

public interface FcOrderService {



    ReulstData selectByUserQuery(UserQuery userQuery);

    ReulstData updataByOrderQuery(FcOrderQuery fcOrderQuery);

    ReulstData selectByTitile(UserQuery userQuery);


}
