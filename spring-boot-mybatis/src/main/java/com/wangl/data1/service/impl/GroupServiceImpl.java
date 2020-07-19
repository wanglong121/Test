package com.wangl.data1.service.impl;

import com.wangl.bean.Group;
import com.wangl.data1.mapper.GroupMapper;
import com.wangl.data1.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    GroupMapper groupMapper;

    public List<Group> getAllGroup(){
        return groupMapper.getAllGroup();
    }
    public void insertGroup(Group group){
        groupMapper.insertGroup(group);
    }
}
