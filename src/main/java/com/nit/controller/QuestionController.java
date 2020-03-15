package com.nit.controller;

import com.nit.service.QuestionService;
import com.nit.service.serviceImpl.QuestionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService = new QuestionServiceImpl();

    @ResponseBody
    @RequestMapping("/submitquestion.do")
    public void submitQuestion(String qContent, String qTitle, String sNum, int cLid, HttpServletResponse response) throws IOException {
        questionService.submitQuestion(qContent,qTitle,sNum,cLid);
        response.getWriter().write("success");
    }
}
