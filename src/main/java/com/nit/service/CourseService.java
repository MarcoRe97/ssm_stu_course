package com.nit.service;

import com.nit.entity.Course;

import javax.annotation.Resource;
import java.util.List;

@Resource
public interface CourseService {
    List<Course> getCourseBySnum(String sNum);

    int findCourseIdByNameWeek(String cName,String cWeek,String cNum);

    int stuAddCourse(int cId,String sNum);
}
