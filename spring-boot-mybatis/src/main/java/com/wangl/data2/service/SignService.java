package com.wangl.data2.service;

import com.wangl.bean.CourseSign;
import com.wangl.bean.Sign;

import java.util.List;

public interface SignService {
    //根据个人id查询打卡记录
    public Sign getSignByeId(int eid);


    //根据id查询打卡记录
    public Sign getSignBycId(int cid);

   //查询所有选课
    public List<CourseSign> getAllSign(int eId, int cGroup);

    //增添选课打卡记录
    public void insertSign(Sign sign);

    //删除打卡记录
    public void deleteSignById(int id);

    //更新
    public void updateSignById(Sign sign);
}
