package com.nit.entity;

import javax.persistence.Entity;

@Entity
public class Student {
    private int id;
    private String sNum;
    private String sPwd;
    private String sCall;
    private String stuClass;
    private String stuName;
    private int sId;
    private int cId;
    private int isDelete;

    public Student(int id, String sNum, String sPwd, String sCall, String stuClass, String stuName, int sId, int cId, int isDelete) {
        this.id = id;
        this.sNum = sNum;
        this.sPwd = sPwd;
        this.sCall = sCall;
        this.stuClass = stuClass;
        this.stuName = stuName;
        this.sId = sId;
        this.cId = cId;
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

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum;
    }

    public String getsPwd() {
        return sPwd;
    }

    public void setsPwd(String sPwd) {
        this.sPwd = sPwd;
    }

    public String getsCall() {
        return sCall;
    }

    public void setsCall(String sCall) {
        this.sCall = sCall;
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
}
