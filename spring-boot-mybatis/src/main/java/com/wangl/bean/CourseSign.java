package com.wangl.bean;

import java.sql.Timestamp;

public class CourseSign {
    private int eId;
    private int cId;
    private int signState;
    private int cGroup;
    private String cClass;
    private String cName;
    private Timestamp cStart;
    private Timestamp cEnd;
    private String cTeacher;
    private String eName;

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getSignState() {
        return signState;
    }

    public void setSignState(int signState) {
        this.signState = signState;
    }

    public int getcGroup() {
        return cGroup;
    }

    public void setcGroup(int cGroup) {
        this.cGroup = cGroup;
    }

    public String getcClass() {
        return cClass;
    }

    public void setcClass(String cClass) {
        this.cClass = cClass;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
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
