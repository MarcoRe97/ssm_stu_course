package com.nit.service.serviceImpl;

import com.nit.dao.AnswerDao;
import com.nit.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Resource
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    AnswerDao answerDao;

    @Override
    public int answerTheQuestion(String aContent, int qId) {
        return answerDao.answerTheQuestion(aContent,qId);
    }
}
