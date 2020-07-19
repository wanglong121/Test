package com.wangl.data2.service.impl;

import com.wangl.bean.Employee;
import com.wangl.data2.mapper.EmployeeMapper;
import com.wangl.data2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployee(){
        return employeeMapper.getAllEmployee();
    }

}
