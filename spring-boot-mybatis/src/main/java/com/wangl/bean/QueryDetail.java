package com.wangl.bean;

public class QueryDetail {
    private int cGroup;
    private String cName;
    private String cClass;
    private int eId;
    private String eName;
    private int attendNum;
    private int courseNum;
    private String attendPercent;

    public int getcGroup() {
        return cGroup;
    }

    public void setcGroup(int cGroup) {
        this.cGroup = cGroup;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int getAttendNum() {
        return attendNum;
    }

    public void setAttendNum(int attendNum) {
        this.attendNum = attendNum;
    }

    public int getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(int courseNum) {
        this.courseNum = courseNum;
    }

    public String getAttendPercent() {
        return attendPercent;
    }

    public void setAttendPercent(String attendPercent) {
        this.attendPercent = attendPercent;
    }
}
