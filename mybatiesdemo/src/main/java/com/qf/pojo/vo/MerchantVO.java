package com.qf.pojo.vo;

import com.qf.pojo.entity.Goods;
import com.qf.pojo.entity.Merchant;
import lombok.Data;

import java.util.List;

@Data
public class MerchantVO extends Merchant {

    private List<GoodsVO> list;

}
