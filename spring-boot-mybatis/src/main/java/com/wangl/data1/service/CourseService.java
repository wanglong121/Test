package com.wangl.data1.service;

import com.wangl.bean.Course;

import java.util.List;

public interface CourseService {

    public List<Course> getCourseById(int id);

    public List<Course> getAllCourse();

    public void insertCourse(Course course);

    public void deleteCourseById(int id);

    public void deleteCourseByCId(int id);

    public void updateCourseById(Course course);

}
