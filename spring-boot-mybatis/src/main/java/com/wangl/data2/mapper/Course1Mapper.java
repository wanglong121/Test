package com.wangl.data2.mapper;

import com.wangl.bean.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Course1Mapper {
    @Select("select * from course where c_group=#{id}")
    public Course getCourseById(int id);

    @Select("select * from course GROUP BY c_group ")
    public List<Course> getAllCourse();

    @Insert("insert into course(c_id,c_group,c_name,c_class,c_start,c_end,c_teacher) values (#{cId},#{cGroup},#{cName},#{cClass},#{cStart},#{cEnd},#{cTeacher})")
    public void insertCourse(Course course);

    @Delete("delete from course where c_group=#{cGroup}")
    public void deleteCourseById(int id);

    @Update("update course set c_name=#{cName},c_class=#{cClass},c_teacher=#{cTeacher} where c_group=#{cGroup}")
    public void updateCourseById(Course course);



}