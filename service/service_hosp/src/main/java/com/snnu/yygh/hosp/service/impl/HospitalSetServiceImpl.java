package com.snnu.yygh.hosp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.snnu.yygh.common.exception.YyghException;
import com.snnu.yygh.common.result.ResultCodeEnum;
import com.snnu.yygh.hosp.mapper.HospitalSetMapper;
import com.snnu.yygh.hosp.service.HospitalSetService;
import com.snnu.yygh.model.hosp.HospitalSet;
import com.snnu.yygh.vo.order.SignInfoVo;
import org.springframework.stereotype.Service;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {


    @Override
    public SignInfoVo getSignInfoVo(String hoscode) {
        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
        wrapper.eq("hoscode",hoscode);
        HospitalSet hospitalSet = baseMapper.selectOne(wrapper);
        if(null == hospitalSet) {
            throw new YyghException(ResultCodeEnum.HOSPITAL_OPEN);
        }
        SignInfoVo signInfoVo = new SignInfoVo();
        signInfoVo.setApiUrl(hospitalSet.getApiUrl());
        signInfoVo.setSignKey(hospitalSet.getSignKey());
        return signInfoVo;
    }
    @Override
    public String getSignKey(String hoscode) {
        QueryWrapper<HospitalSet> queryWrapper = new QueryWrapper();
        queryWrapper.eq("hoscode", hoscode);
        HospitalSet hospitalSet = baseMapper.selectOne(queryWrapper);

        return hospitalSet.getSignKey();
    }
}
