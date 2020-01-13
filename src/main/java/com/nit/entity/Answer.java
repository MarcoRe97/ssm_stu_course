package com.nit.entity;

import javax.persistence.Entity;

@Entity
public class Answer {
    private int aId;
    private String aContent;
    private int qId;

    public Answer(int aId, String aContent, int qId) {
        this.aId = aId;
        this.aContent = aContent;
        this.qId = qId;
    }

    public Answer() {
    }

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaContent() {
        return aContent;
    }

    public void setaContent(String aContent) {
        this.aContent = aContent;
    }

    public int getqId() {
        return qId;
    }

    public void setqId(int qId) {
        this.qId = qId;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "aId=" + aId +
                ", aContent='" + aContent + '\'' +
                ", qId=" + qId +
                '}';
    }
}
