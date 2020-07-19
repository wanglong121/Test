package com.wangl.data2.service;

import com.wangl.bean.Course;

import java.util.List;

public interface Course1Service {
    //根据cGroup查询课程
    public Course getCourseById(int id);

    //查询所有课程（所有不重复的组课程）
    public List<Course> getAllCourse();

    //插入课程
    public void insertCourse(Course course);

    //删除课程
    public void deleteCourseById(int id);

    //更新课程（更新所有课程组的课程信息）
    public void updateCourseById(Course course);

}