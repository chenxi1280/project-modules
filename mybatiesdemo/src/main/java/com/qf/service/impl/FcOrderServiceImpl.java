package com.qf.service.impl;

import com.qf.dao.FcOrderDao;
import com.qf.dao.OrderItemDao;
import com.qf.pojo.dto.ReulstData;
import com.qf.pojo.entity.FcOrder;
import com.qf.pojo.entity.OrderItem;
import com.qf.pojo.query.UserQuery;
import com.qf.pojo.vo.FcOrderVO;
import com.qf.pojo.vo.OrderItemVO;
import com.qf.service.FcOrderService;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FcOrderServiceImpl implements FcOrderService {
    private FcOrderDao fcOrderDao;
    private OrderItemDao orderItemDao;

    public ReulstData selectByUserQuery(UserQuery userQuery) {

        List<FcOrderVO> list = fcOrderDao.selectByUserQuery(userQuery);
        if (list != null && list.size() >0) {
            List<OrderItemVO> listoiv = orderItemDao.selectByOrders(list);
            Map<Long, List<OrderItemVO>> collect = listoiv.stream().collect(Collectors.groupingBy(OrderItemVO::getUserId));
            list.forEach((v) -> {
                v.setOrderItemVOList(collect.get(v.getUserId()));
            });
        }
        Map<String, Collection> map = new HashMap<>();
        map.put("data",list);

        return ReulstData.ok(map);
    }
}
