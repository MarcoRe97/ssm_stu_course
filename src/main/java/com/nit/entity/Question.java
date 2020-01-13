package com.nit.entity;

import javax.persistence.Entity;

@Entity
public class Question {
    private int qId;
    private String qContent;
    private String qTitle;
    private String sNum;
    private int cId;

    public Question(int qId, String qContent, String qTitle, String sNum, int cId) {
        this.qId = qId;
        this.qContent = qContent;
        this.qTitle = qTitle;
        this.sNum = sNum;
        this.cId = cId;
    }

    public Question() {
    }

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    public String getqContent() {
        return qContent;
    }

    public void setqContent(String qContent) {
        this.qContent = qContent;
    }

    public String getqTitle() {
        return qTitle;
    }

    public void setqTitle(String qTitle) {
        this.qTitle = qTitle;
    }

    public String getsNum() {
        return sNum;
    }

    public void setsNum(String sNum) {
        this.sNum = sNum;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Override
    public String toString() {
        return "Question{" +
                "qId=" + qId +
                ", qContent='" + qContent + '\'' +
                ", qTitle='" + qTitle + '\'' +
                ", sNum='" + sNum + '\'' +
                ", cId=" + cId +
                '}';
    }
}
