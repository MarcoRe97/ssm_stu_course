package com.nit.service.serviceImpl;

import com.nit.dao.StudentDao;
import com.nit.entity.Student;
import com.nit.entity.Suser;
import com.nit.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
@Resource
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public int checkLogin(String sNum, String stuPwd) {
        Student student = studentDao.findByStuNum(sNum);
        System.out.println(student);
//        账号密码均正确
        if(student.getsPwd().equals(stuPwd) && student != null){
            return 1;
        }
//        密码错误，账号存在
        else if(student !=null){
            return 2;
        }

        return 0;
    }

    @Override
    public boolean checkStuNum(String stuNum) {
        String stu = studentDao.findStuWithStuNum(stuNum);
        if(stu != null)
        {
            return true;
        }
        return false;
    }

    @Override
    public int addStudentUser(Student student) {
        return studentDao.registerStudent(student);
    }
}
