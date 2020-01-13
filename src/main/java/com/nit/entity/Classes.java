package com.nit.entity;

import javax.persistence.Entity;

@Entity
public class Classes {
    private int cLid;
    private String cLname;
    private String cLnum;
    private int tId;

    public Classes() {
    }

    public Classes(int cLid, String cLname, String cLnum, int tId) {
        this.cLid = cLid;
        this.cLname = cLname;
        this.cLnum = cLnum;
        this.tId = tId;
    }

    public int getcLid() {
        return cLid;
    }

    public void setcLid(int cLid) {
        this.cLid = cLid;
    }

    public String getcLname() {
        return cLname;
    }

    public void setcLname(String cLname) {
        this.cLname = cLname;
    }

    public String getcLnum() {
        return cLnum;
    }

    public void setcLnum(String cLnum) {
        this.cLnum = cLnum;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "cLid=" + cLid +
                ", cLname='" + cLname + '\'' +
                ", cLnum='" + cLnum + '\'' +
                ", tId=" + tId +
                '}';
    }
}
