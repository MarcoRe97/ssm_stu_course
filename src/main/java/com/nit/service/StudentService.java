package com.nit.service;

import javax.annotation.Resource;

@Resource
public interface StudentService {
    int checkLogin(String stuNum,String stuPwd);
}
