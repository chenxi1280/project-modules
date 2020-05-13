package com.qf.service;

import com.qf.pojo.dto.ReulstData;
import com.qf.pojo.query.MerchantQuery;

public interface MerchantService {

    ReulstData selectByName(MerchantQuery merchantQuery);

    ReulstData selectByTitle(MerchantQuery merchantQuery);
}
