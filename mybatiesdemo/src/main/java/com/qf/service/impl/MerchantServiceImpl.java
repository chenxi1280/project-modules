package com.qf.service.impl;

import com.qf.dao.GoodsDao;
import com.qf.dao.MerchantDao;
import com.qf.pojo.dto.ReulstData;
import com.qf.pojo.query.MerchantQuery;
import com.qf.pojo.vo.GoodsVO;
import com.qf.pojo.vo.MerchantVO;
import com.qf.service.MerchantService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MerchantServiceImpl implements MerchantService {
    private MerchantDao merchantDao;
    private GoodsDao goodsDao;


    @Override
    public ReulstData selectByName(MerchantQuery merchantQuery) {
        List<MerchantVO>  list = merchantDao.selectByName(merchantQuery);
        if (list != null){
            List<GoodsVO> goodsVOList = goodsDao.selectByMerchantId(list);
            Map<Long, List<GoodsVO>> collect = goodsVOList.stream().collect(Collectors.groupingBy(GoodsVO::getMerchantId));
            list.forEach((v) -> {
                v.setList(collect.get(v.getMerchantId()));
            });
            Map<String,Object> map = new HashMap<>();
            map.put("data",map);
            return ReulstData.ok(list);
        }

        return ReulstData.fail("失败");
    }

    @Override
    public ReulstData selectByTitle(MerchantQuery merchantQuery) {
        List<MerchantVO> list = merchantDao.selectByTitle( merchantQuery);
        if (list != null && list.size() > 0){
            Map<String,Object> map = new HashMap<>();
//            map.put("data",l)

            return ReulstData.ok(list);
        }

        return ReulstData.fail("失败");
    }
}
