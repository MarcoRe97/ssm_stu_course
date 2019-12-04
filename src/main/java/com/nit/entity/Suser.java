package com.nit.entity;

public class Suser {
    private int id;
    private String lName;
    private String lPwd;
    private String lCall;
    private String lId;
    private String sId;
    private int isDelete;

    public Suser(int id, String lName, String lPwd, String lCall, String lId, String sId, int isDelete) {
        this.id = id;
        this.lName = lName;
        this.lPwd = lPwd;
        this.lCall = lCall;
        this.lId = lId;
        this.sId = sId;
        this.isDelete = isDelete;
    }

    public Suser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getlPwd() {
        return lPwd;
    }

    public void setlPwd(String lPwd) {
        this.lPwd = lPwd;
    }

    public String getlCall() {
        return lCall;
    }

    public void setlCall(String lCall) {
        this.lCall = lCall;
    }

    public String getlId() {
        return lId;
    }

    public void setlId(String lId) {
        this.lId = lId;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Suser{" +
                "id=" + id +
                ", lName='" + lName + '\'' +
                ", lPwd='" + lPwd + '\'' +
                ", lCall='" + lCall + '\'' +
                ", lId='" + lId + '\'' +
                ", sId='" + sId + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
