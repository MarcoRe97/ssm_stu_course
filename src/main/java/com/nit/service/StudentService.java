package com.nit.service;

import com.nit.entity.Student;
import com.nit.entity.Suser;

import javax.annotation.Resource;

@Resource
public interface StudentService {
    int checkLogin(String stuNum,String stuPwd);

    boolean checkStuNum(String stuNum);

    int addStudentUser(Student student);
}
