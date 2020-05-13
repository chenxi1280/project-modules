package com.qf.service.impl;

import com.qf.dao.FcOrderDao;
import com.qf.dao.OrderItemDao;
import com.qf.pojo.dto.ReulstData;
import com.qf.pojo.entity.FcOrder;
import com.qf.pojo.entity.OrderItem;
import com.qf.pojo.query.FcOrderQuery;
import com.qf.pojo.query.UserQuery;
import com.qf.pojo.vo.FcOrderVO;
import com.qf.pojo.vo.OrderItemVO;
import com.qf.service.FcOrderService;

import java.math.BigDecimal;
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
        BigDecimal sum = new BigDecimal("0");
        if (list != null && list.size() >0) {
            List<OrderItemVO> listoiv = orderItemDao.selectByOrders(list);
            Map<Long, List<OrderItemVO>> collect = listoiv.stream().collect(Collectors.groupingBy(OrderItemVO::getUserId));


//            list.forEach((v) -> {
//                v.setOrderItemVOList(collect.get(v.getUserId()));
//                sum.add(v.getActuallyPaid());
//            });

            for (FcOrderVO v: list){
                v.setOrderItemVOList(collect.get(v.getUserId()));
                if ("已完成".equals(v.getCommissionType())) {
                    sum = sum.add(v.getActuallyPaid());
                }
            }
        }
        Map<String, Object> map = new HashMap<>();
        map.put("data",list);
        map.put("sum", sum);
        return ReulstData.ok(map);
    }

    @Override
    public ReulstData updataByOrderQuery(FcOrderQuery fcOrderQuery) {
        int i = fcOrderDao.updataByOrderQuery(fcOrderQuery);
        if ( i >= 1 ){
            return ReulstData.ok("ok");
        }
        return ReulstData.fail("失败");
    }

    @Override
    public ReulstData selectByTitile(UserQuery userQuery) {
        List<FcOrderVO> list= fcOrderDao.selectByTitile(userQuery);

        if (list != null && list.size() >1){

            return ReulstData.ok(list);
        }

        return ReulstData.fail("失败");
    }
}
