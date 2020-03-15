package com.nit.service.serviceImpl;

import com.nit.dao.QuestionDao;
import com.nit.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Resource
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionDao questionDao;

    @Override
    public int submitQuestion(String qContent, String qTitle, String sNum, int cLid) {
        return questionDao.submitQuestion(qContent,qTitle,sNum,cLid);
    }
}
