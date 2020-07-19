package com.wangl.data1.mapper;

import com.wangl.bean.Group;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupMapper {
    @Select("select * from cgroup")
    public List<Group> getAllGroup();

    @Options(useGeneratedKeys = true, keyProperty = "gId")
    @Insert("insert into cgroup(g_name) values (#{gName})")
    public void insertGroup(Group group);
}
