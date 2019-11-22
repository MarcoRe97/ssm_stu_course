package com.nit.entity;

import javax.persistence.Entity;

@Entity
public class Student {
    private int id;
    private String stuNum;
    private String stuPwd;
    private String stuCall;
    private String stuClass;
    private String stuName;
    private int courseId;
    private int isDelete;

    public Student(int id, String stuNum, String stuPwd, String stuCall, String stuClass, String stuName, int courseId, int isDelete) {
        this.id = id;
        this.stuNum = stuNum;
        this.stuPwd = stuPwd;
        this.stuCall = stuCall;
        this.stuClass = stuClass;
        this.stuName = stuName;
        this.courseId = courseId;
        this.isDelete = isDelete;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuPwd() {
        return stuPwd;
    }

    public void setStuPwd(String stuPwd) {
        this.stuPwd = stuPwd;
    }

    public String getStuCall() {
        return stuCall;
    }

    public void setStuCall(String stuCall) {
        this.stuCall = stuCall;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuNum='" + stuNum + '\'' +
                ", stuPwd='" + stuPwd + '\'' +
                ", stuCall='" + stuCall + '\'' +
                ", stuClass='" + stuClass + '\'' +
                ", stuName='" + stuName + '\'' +
                ", courseId=" + courseId +
                ", isDelete=" + isDelete +
                '}';
    }
}
