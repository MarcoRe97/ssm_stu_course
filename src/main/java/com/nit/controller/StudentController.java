package com.nit.controller;

import com.nit.entity.Student;
import com.nit.service.StudentService;
import com.nit.service.serviceImpl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService = new StudentServiceImpl();

    @ResponseBody
    @RequestMapping("/login.do")
    public void checkLogin(String stuNum, String stuPwd,HttpServletResponse response) throws IOException {
//        String stuNum = request.getParameter("account");
//        String stuPwd = request.getParameter("secret");
        int flag;
        flag = studentService.checkLogin(stuNum,stuPwd);
        if(flag == 1){
            response.getWriter().write("success");
//            return "success";
        }
        else if(flag == 2){
            response.getWriter().write("faile-password");
        }
        else{
            response.getWriter().write("faile");
        }
    }
}
