package com.wangl.bean;

import java.sql.Timestamp;

public class Course {
    private int cId;
    private int cGroup;
    private String cName;
    private String cClass;
    private Timestamp cStart;
    private Timestamp cEnd;
    private String cTeacher;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

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

    public Timestamp getcStart() {
        return cStart;
    }

    public void setcStart(Timestamp cStart) {
        this.cStart = cStart;
    }

    public Timestamp getcEnd() {
        return cEnd;
    }

    public void setcEnd(Timestamp cEnd) {
        this.cEnd = cEnd;
    }

    public String getcTeacher() {
        return cTeacher;
    }

    public void setcTeacher(String cTeacher) {
        this.cTeacher = cTeacher;
    }
}