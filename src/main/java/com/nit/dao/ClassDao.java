package com.nit.dao;

import com.nit.entity.Classes;

import java.util.List;

public interface ClassDao {
    List<Classes> getAllClassBySnum(String sNum);

    int getClassIdByClassNum(String cLnum);

    int stuGetIntoClass(int cLid,String sNum);
}
