package com.snnu.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.snnu.yygh.model.cmn.Dict;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
//vvddd
public interface DictService extends IService<Dict> {
    List<Dict> findChlidData(Long id);

    void exportDictData(HttpServletResponse response);

    void importDictData(MultipartFile file);

    String getDictName(String dictCode, String value);

    List<Dict> findByDictCode(String dictCode);
}
