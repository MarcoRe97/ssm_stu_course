package com.nit.service.serviceImpl;

import com.nit.dao.ClassDao;
import com.nit.entity.Classes;
import com.nit.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Resource
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassDao classDao;

    @Override
    public List<Classes> getAllClassBySnum(String sNum) {
        return classDao.getAllClassBySnum(sNum);
    }

    @Override
    public int getClassIdByClassNum(String cLnum) {
        return classDao.getClassIdByClassNum(cLnum);
    }

    @Override
    public int stuGetIntoClass(int cLid, String sNum) {
        return classDao.stuGetIntoClass(cLid,sNum);
    }
}
