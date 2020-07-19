package com.wangl.data1.mapper;

import com.wangl.bean.Administrators;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorsMapper {
    @Select("select * from administrators where a_id=#{id}")
    public Administrators getAdminById(int id);

}
