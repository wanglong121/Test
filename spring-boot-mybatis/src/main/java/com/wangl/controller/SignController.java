package com.wangl.controller;

import com.wangl.bean.CourseSign;
import com.wangl.bean.QueryDetail;
import com.wangl.bean.QuerySign;
import com.wangl.data2.service.SignService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("sign")
@CrossOrigin("*")
public class SignController {
    @Autowired
    SignService signService;

    @RequestMapping("/querySign")
    public JSONObject querySign(@RequestBody QuerySign querySign, HttpServletRequest httpServletRequest){
        int cGroup = querySign.getcGroup();
        int eId = querySign.geteId();

        List<CourseSign> courseSignList = signService.getAllSign(eId,cGroup);
        List<CourseSign> courseSignList1 = new ArrayList<>();
        Timestamp cStart = Timestamp.valueOf(querySign.getcStart());
        Timestamp cEnd = Timestamp.valueOf(querySign.getcEnd());
        for(CourseSign courseSign : courseSignList){
            if(courseSign.getcStart().after(cStart)&&courseSign.getcEnd().before(cEnd)){
                courseSignList1.add(courseSign);
            }
        }
        int attendNum = 0;
        for(CourseSign courseSign1 : courseSignList){
            if(courseSign1.getSignState()==1)
                attendNum++;
        }
        int courseNum = courseSignList1.size();
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);
        String attendPercent = numberFormat.format((float)attendNum/(float) courseNum*100)+"%";
        System.out.println(attendPercent);
        CourseSign courseSign = courseSignList1.get(0);
        QueryDetail queryDetail = new QueryDetail();
        queryDetail.setcGroup(courseSign.getcGroup());
        queryDetail.setcName(courseSign.getcName());
        queryDetail.setcClass(courseSign.getcClass());
        queryDetail.seteId(courseSign.geteId());
        queryDetail.seteName(courseSign.geteName());
        queryDetail.setAttendNum(attendNum);
        queryDetail.setCourseNum(courseNum);
        queryDetail.setAttendPercent(attendPercent);
        JSONObject json = JSONObject.fromObject(queryDetail);
        return json;
    }


}
