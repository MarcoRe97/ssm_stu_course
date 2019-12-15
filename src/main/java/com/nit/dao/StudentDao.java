package com.nit.dao;

import com.nit.entity.Student;
import com.nit.entity.Suser;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao {
    Student findByStuNum(String sNum);

    String findStuWithStuNum(String stuNum);

    int registerStudent(Student student);
}
