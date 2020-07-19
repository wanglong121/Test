package com.wangl.data2.service.impl;


import com.wangl.bean.CourseSign;
import com.wangl.bean.Sign;
import com.wangl.data2.mapper.SignMapper;
import com.wangl.data2.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignServicelmpl implements SignService{
    @Autowired
    SignMapper signMapper;

    //根据个人id查询打卡记录
    public Sign getSignByeId(int eid) {
        return signMapper.getSignByeId(eid);
    }

    //根据id查询打卡记录
    public Sign getSignBycId(int cid) {
        return signMapper.getSignBycId(cid);
    }

    //查询所有选课
    public List<CourseSign> getAllSign(int eId, int cGroup) {
        return signMapper.getAllSign(eId, cGroup);
    }

    //增添选课打卡记录
    public void insertSign(Sign sign) {
        signMapper.insertSign(sign);
    }


    //删除打卡记录
    public void deleteSignById(int id) {
        signMapper.getSignByeId(id);
    }

    //更新
    public void updateSignById(Sign sign) {
        signMapper.updateSignById(sign);
    }

}
