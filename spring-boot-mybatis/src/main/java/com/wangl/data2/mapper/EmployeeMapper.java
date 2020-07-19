package com.wangl.data2.mapper;

import com.wangl.bean.Employee;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {
    @Select("select e_id, e_name from employee")
    public List<Employee> getAllEmployee();


}
