package com.nit.dao;

import com.nit.entity.Course;

import java.util.List;

public interface CourseDao {
    List<Course> getAllCourses(String sNum);

    String findCourseIdByNameWeek(String cName,String cWeek,String cNum);

    int stuAddCourse(int cId,String sNum);
}
