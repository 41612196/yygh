package com.snnu.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snnu.yygh.model.cmn.Dict;

import java.util.List;
//vvddd
public interface DictService extends IService<Dict> {
    List<Dict> findChlidData(Long id);
}
