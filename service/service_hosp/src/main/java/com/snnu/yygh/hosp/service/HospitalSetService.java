package com.snnu.yygh.hosp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snnu.yygh.model.hosp.HospitalSet;
import com.snnu.yygh.vo.order.SignInfoVo;

public interface HospitalSetService extends IService<HospitalSet> {
    String getSignKey(String hoscode);

    SignInfoVo getSignInfoVo(String hoscode);
}
