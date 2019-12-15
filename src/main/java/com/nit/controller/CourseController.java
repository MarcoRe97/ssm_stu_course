package com.nit.controller;

import com.nit.entity.Course;
import com.nit.service.CourseService;
import com.nit.service.serviceImpl.CourseServiceImpl;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService = new CourseServiceImpl();

    @ResponseBody
    @RequestMapping(value = "/getcourse.do",produces = "text/html; charset=UTF-8")
    public void getCourseBySnum(String sNum, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        List<Course> courses = new ArrayList<>();
        courses = courseService.getCourseBySnum(sNum);
        System.out.println(courses);
        response.getWriter().write(JSONArray.fromObject(courses).toString());
    }

    @ResponseBody
    @RequestMapping("/addcourse.do")
    public void stuAddCourse(String cName, String cWeek, String cNum, HttpServletResponse response, HttpSession session) throws IOException {
        String stuNum = session.getAttribute("userName").toString();
        String strCid = courseService.findCourseIdByNameWeek(cName,cWeek,cNum);
        if(strCid == null){
            response.getWriter().write("error");
        }
        else{
            courseService.stuAddCourse(Integer.parseInt(strCid),stuNum);
            response.getWriter().write("success");
        }
    }
}
