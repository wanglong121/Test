package com.wangl.bean;

import java.sql.Time;
import java.sql.Timestamp;

public class QuerySign {
    private int eId;
    private int cGroup;
    private String cStart;
    private String cEnd;

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getcGroup() {
        return cGroup;
    }

    public void setcGroup(int cGroup) {
        this.cGroup = cGroup;
    }

    public String getcStart() {
        return cStart;
    }

    public void setcStart(String cStart) {
        this.cStart = cStart;
    }

    public String getcEnd() {
        return cEnd;
    }

    public void setcEnd(String cEnd) {
        this.cEnd = cEnd;
    }
}
