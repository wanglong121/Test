package com.wangl.data1.service;

import com.wangl.bean.Group;
import java.util.List;


public interface GroupService {
    public List<Group> getAllGroup();

    public void insertGroup(Group group);
}
