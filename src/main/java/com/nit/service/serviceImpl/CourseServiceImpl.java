package com.nit.service.serviceImpl;

import com.nit.dao.CourseDao;
import com.nit.entity.Course;
import com.nit.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Resource
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourseBySnum(String sNum) {
        return courseDao.getAllCourses(sNum);
    }

    @Override
    public String findCourseIdByNameWeek(String cName, String cWeek, String cNum) {
        return courseDao.findCourseIdByNameWeek(cName,cWeek,cNum);
    }

    @Override
    public int stuAddCourse(int cId, String sNum) {
        return courseDao.stuAddCourse(cId,sNum);
    }
}
