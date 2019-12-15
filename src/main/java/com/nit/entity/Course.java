package com.nit.entity;


import javax.persistence.Entity;

@Entity
public class Course {
    private int cId;
    private String cName;
    private String cWeek;
    private String cNum;
    private int tId;

    public Course(int cId, String cName, String cWeek, String cNum, int tId) {
        this.cId = cId;
        this.cName = cName;
        this.cWeek = cWeek;
        this.cNum = cNum;
        this.tId = tId;
    }

    public Course() {
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcWeek() {
        return cWeek;
    }

    public void setcWeek(String cWeek) {
        this.cWeek = cWeek;
    }

    public String getcNum() {
        return cNum;
    }

    public void setcNum(String cNum) {
        this.cNum = cNum;
    }


    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cWeek='" + cWeek + '\'' +
                ", cNum='" + cNum + '\'' +
                ", tId=" + tId +
                '}';
    }
}
