package com.wangl.controller;

import com.wangl.bean.*;
import com.wangl.data1.service.CourseService;
import com.wangl.data1.service.GroupService;
import com.wangl.data2.service.Course1Service;
import com.wangl.data2.service.EmployeeService;
import com.wangl.data2.service.SignService;
import com.wangl.utils.JsonDateValueProcessorUtil;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLOutput;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("course")
@CrossOrigin("*")
public class CourseController {
    @Autowired
    CourseService courseService;
    @Autowired
    Course1Service course1Service;
    @Autowired
    SignService signService;
    @Autowired
    GroupService groupService;
    @Autowired
    EmployeeService employeeService;

    //新建课程组
    @RequestMapping("/insertGroup")
    public JSONObject insertAllCourses(@RequestBody Group group, HttpServletRequest httpServletRequest){
        groupService.insertGroup(group);
        JSONObject json = JSONObject.fromObject(group);
        return json;

    }

    //获取所有课程组信息
    @RequestMapping("/getAllGroup")
    public JSONArray getAllGroup(HttpServletRequest httpServletRequest){
        List<Group> groupList = groupService.getAllGroup();
        JSONArray array = JSONArray.fromObject(groupList);
        return array;
    }

    //获取所有员工信息
    @RequestMapping("/getAllEmployee")
    public JSONArray getAllEmployee(HttpServletRequest httpServletRequest){
       List<Employee> employeeList = employeeService.getAllEmployee();
        JSONArray array = JSONArray.fromObject(employeeList);
        return array;
    }



    //新建课程
    @RequestMapping("/insertAllCourses")
    public JSONArray insertAllCourses(@RequestBody List<ICourse> courseList, HttpServletRequest httpServletRequest){
        List<Course> courseList1 = new ArrayList<>();
        Map<String,Object> result = new HashMap<String,Object>();
        for(ICourse course : courseList){
            Course course1 = new Course();
            course1.setcName(course.getcName());
            course1.setcGroup(course.getcGroup());
            course1.setcClass(course.getcClass());
            System.out.println(course.getcStart());
            course1.setcStart(Timestamp.valueOf(course.getcStart()));
            course1.setcEnd(Timestamp.valueOf(course.getcEnd()));
            course1.setcTeacher(course.getcTeacher());
            courseList1.add(course1);
        }
        System.out.println("----");
        for(Course c : courseList1){
            courseService.insertCourse(c);
            course1Service.insertCourse(c);
        }
//        System.out.println("***");
//        String message = "添加成功";
//        result.put("message",message);
//        JSONObject json = JSONObject.fromObject(result);
//        return json;
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessorUtil("yyyy-MM-dd HH:mm:ss"));
        JSONArray array = JSONArray.fromObject(courseList1,jsonConfig);
        return array;
    }

    //删除课程
    @RequestMapping("/deleteCourseById")
    public JSONObject deleteCourseById(@RequestBody Course course, HttpServletRequest httpServletRequest){
        int cGroup = course.getcGroup();
        System.out.println(cGroup);
        courseService.deleteCourseById(cGroup);
        course1Service.deleteCourseById(cGroup);
        Map<String,Object> result = new HashMap<String,Object>();
        String message = "删除成功";
        result.put("message",message);
        JSONObject json = JSONObject.fromObject(result);
        return json;
    }

    //删除课程
    @RequestMapping("/deleteCourseByCId")
    public JSONObject deleteCourseByCId(@RequestBody Course course, HttpServletRequest httpServletRequest){
        int cId = course.getcId();
        System.out.println(cId);
        courseService.deleteCourseById(cId);
        course1Service.deleteCourseById(cId);
        Map<String,Object> result = new HashMap<String,Object>();
        String message = "删除成功";
        result.put("message",message);
        JSONObject json = JSONObject.fromObject(result);
        return json;
    }
    //获取所有课程组
    @RequestMapping("/getAllCourse")
    public JSONArray getAllCourse(HttpServletRequest httpServletRequest){
        List<Course> courseList=courseService.getAllCourse();
        System.out.println(courseList.size());
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessorUtil("yyyy-MM-dd HH:mm:ss"));
        JSONArray array = JSONArray.fromObject(courseList,jsonConfig);
        return array;
    }
    //获取课程组内课程
    @RequestMapping("/getCourseByGroup")
    public JSONArray getCourseByGroup(@RequestBody Course course,HttpServletRequest httpServletRequest){
        int cGroup = course.getcGroup();
        List<Course> courseList=courseService.getCourseById(cGroup);
        System.out.println(courseList.size());
        JsonConfig jsonConfig = new JsonConfig();
        jsonConfig.registerJsonValueProcessor(Timestamp.class, new JsonDateValueProcessorUtil("yyyy-MM-dd HH:mm:ss"));
        JSONArray array = JSONArray.fromObject(courseList,jsonConfig);
        return array;
    }
    //插入签到记录
    @RequestMapping("/insertSign")
    public JSONObject insertSign(@RequestBody EmployeeSign employeeSign, HttpServletRequest httpServletRequest){
        int cGroup = employeeSign.getcGroup();
        int[] eIds = employeeSign.geteIds();
        List<Course> courseList = courseService.getCourseById(cGroup);
        for(Course course : courseList){
            for (int i : eIds){
                Sign sign = new Sign();
                sign.setcId(course.getcId());
                sign.seteId(i);
                sign.setSignState(0);
                signService.insertSign(sign);
            }
        }
        Map<String,Object> result = new HashMap<String,Object>();
        String message = "添加成功";
        result.put("message",message);
        JSONObject json = JSONObject.fromObject(result);
        return json;
    }











}
