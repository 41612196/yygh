package com.snnu.yygh.hosp.service;


import com.snnu.yygh.model.hosp.Department;
import com.snnu.yygh.vo.hosp.DepartmentQueryVo;
import com.snnu.yygh.vo.hosp.DepartmentVo;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Map;

public interface DepartmentService {

    void save(Map<String, Object> paramMap);

    Page<Department> findPageDepartment(int page, int limit, DepartmentQueryVo departmentQueryVo);

    void remove(String hoscode, String depcode);

    List<DepartmentVo> findDeptTree(String hoscode);

    Department getDepartment(String hoscode, String depcode);

    String getDepName(String hoscode, String depcode);
}
