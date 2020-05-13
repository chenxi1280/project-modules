package com.qf.dao;

import com.qf.pojo.entity.Goods;
import com.qf.pojo.vo.GoodsVO;
import com.qf.pojo.vo.MerchantVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {
    int deleteByPrimaryKey(Long goodsId);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Long goodsId);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);

    List<GoodsVO> selectByMerchantId(@Param("mids") List<MerchantVO> list);
}