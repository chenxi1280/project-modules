package com.qf.pojo.vo;

import com.qf.pojo.entity.FcOrder;
import lombok.Data;

import java.util.List;

@Data
public class FcOrderVO extends FcOrder {

    private List<OrderItemVO> orderItemVOList;

}
