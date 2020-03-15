package com.nit.controller;

import com.nit.service.AnswerService;
import com.nit.service.serviceImpl.AnswerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService = new AnswerServiceImpl();

    @ResponseBody
    @RequestMapping("answerquestion.do")
    public void answerTheQuestion(String aContent, int qId, HttpServletResponse response) throws IOException {
        answerService.answerTheQuestion(aContent,qId);
        response.getWriter().write("success");
    }

}
