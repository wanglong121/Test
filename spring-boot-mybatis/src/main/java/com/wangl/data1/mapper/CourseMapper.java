package com.wangl.data1.mapper;

import com.wangl.bean.Course;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CourseMapper {
    @Select("select * from course where c_group=#{id}")
    public List<Course> getCourseById(int id);

    @Select("select * from course GROUP BY c_group ")
    public List<Course> getAllCourse();

    @Options(useGeneratedKeys = true, keyProperty = "cId")
    @Insert("insert into course(c_group,c_name,c_class,c_start,c_end,c_teacher) values (#{cGroup},#{cName},#{cClass},#{cStart},#{cEnd},#{cTeacher})")
    public void insertCourse(Course course);

    @Delete("delete from course where c_group=#{cGroup}")
    public void deleteCourseById(int cGroup);

    @Delete("delete from course where c_id=#{cId}")
    public void deleteCourseByCId(int cId);

    @Update("update course set c_name=#{cName},c_class=#{cClass},c_teacher=#{cTeacher} where c_group=#{cGroup}")
    public void updateCourseById(Course course);





}