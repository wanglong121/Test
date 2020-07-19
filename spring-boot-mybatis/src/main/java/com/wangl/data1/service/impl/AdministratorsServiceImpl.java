package com.wangl.data1.service.impl;

import com.wangl.bean.Administrators;
import com.wangl.data1.mapper.AdministratorsMapper;
import com.wangl.data1.service.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdministratorsServiceImpl implements AdministratorsService {
    @Autowired
    AdministratorsMapper administratorsMapper;

    public Administrators getAdminById(int id){
        return administratorsMapper.getAdminById(id);
    }

}