package com.qf.pojo.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * merchant
 * @author 
 */
@Data
public class Merchant implements Serializable {
    /**
     * 商户id
     */
    private Long merchantId;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 经度
     */
    private Double lng;

    /**
     * 纬度
     */
    private Double lat;

    /**
     * 地址
     */
    private String address;

    /**
     * 店铺logo
     */
    private String logo;

    private static final long serialVersionUID = 1L;
}