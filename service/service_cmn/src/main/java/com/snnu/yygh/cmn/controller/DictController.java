package com.snnu.yygh.cmn.controller;

import com.snnu.yygh.cmn.service.DictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/cmn/dict")
public class DictController {
    @Autowired
    private DictService dictService;
}
