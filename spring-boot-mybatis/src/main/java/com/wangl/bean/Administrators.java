package com.wangl.bean;

public class Administrators {
    private int aId;
    private String aName;
    private String aPwd;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaPwd() {
        return aPwd;
    }

    public void setaPwd(String aPwd) {
        this.aPwd = aPwd;
    }

    @Override
    public String toString() {
        return "Administrators{" +
                "aId=" + aId +
                ", aName='" + aName + '\'' +
                ", aPwd='" + aPwd + '\'' +
                '}';
    }
}
