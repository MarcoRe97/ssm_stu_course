package com.nit.dao;

public interface QuestionDao {
    int submitQuestion(String qContent,String qTitle,String sNum,int cLid);
}
