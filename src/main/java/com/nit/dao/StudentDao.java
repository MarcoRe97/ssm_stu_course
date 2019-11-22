package com.nit.dao;

import com.nit.entity.Student;
import org.springframework.stereotype.Repository;

//@Repository
public interface StudentDao {
    Student findByStuNum(String stuNum);
}
