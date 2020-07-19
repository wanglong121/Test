package com.wangl.data1.service.impl;

import com.wangl.bean.Course;
import com.wangl.data1.mapper.CourseMapper;
import com.wangl.data1.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    CourseMapper courseMapper;
    //根据cGroup查询课程
    public List<Course> getCourseById(int id){
        return courseMapper.getCourseById(id);
    }

    //查询所有课程（所有不重复的组课程）
    public List<Course> getAllCourse(){
        return courseMapper.getAllCourse();
    }

    //插入课程
    public void insertCourse(Course course){
        courseMapper.insertCourse(course);
    }

    //删除课程
    public void deleteCourseById(int cGroup){
        courseMapper.deleteCourseById(cGroup);
    }

    public void deleteCourseByCId(int cId){
        courseMapper.deleteCourseByCId(cId);
    }

    //更新课程（更新所有课程组的课程信息）
    public void updateCourseById(Course course){
        courseMapper.updateCourseById(course);
    }

}
