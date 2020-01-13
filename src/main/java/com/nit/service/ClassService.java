package com.nit.service;

import com.nit.entity.Classes;

import java.util.List;

public interface ClassService {
    List<Classes> getAllClassBySnum(String sNum);

    int getClassIdByClassNum(String cLnum);

    int stuGetIntoClass(int cLid,String sNum);
}
