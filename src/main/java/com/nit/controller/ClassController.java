package com.nit.controller;

import com.nit.entity.Classes;
import com.nit.service.ClassService;
import net.sf.json.JSONArray;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/class")
public class ClassController {

    @Autowired
    private ClassService classService;

    @ResponseBody
    @RequestMapping("/getclass.do")
    public void getAllClassBySnum(String sNum, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        List<Classes> classes = classService.getAllClassBySnum(sNum);
        System.out.println(classes);
        response.getWriter().write(JSONArray.fromObject(classes).toString());
    }

    @ResponseBody
    @RequestMapping("/addstuforclass.do")
    public void stuGetIntoClassByCnum(String cLnum,String sNum,HttpServletResponse response) throws IOException {
        int classId;
        classId = classService.getClassIdByClassNum(cLnum);
        if(classId != 0){
            classService.stuGetIntoClass(classId,sNum);
            response.getWriter().write("success");
        }
        else{
            response.getWriter().write("error");
        }
    }
}
