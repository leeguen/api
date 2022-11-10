package com.iscreamedu.test.api.student.domain;

import java.sql.Timestamp;

public class Subject {

    int ssvc_akey;
    String subj_cd;
    String subj_nm;
    String curr_typ;
    String curr_typ_nm;
    Timestamp reg_dttm;


    public int getSsvc_akey() {
        return ssvc_akey;
    }

    public void setSsvc_akey(int ssvc_akey) {
        this.ssvc_akey = ssvc_akey;
    }

    public String getSubj_cd() {
        return subj_cd;
    }

    public void setSubj_cd(String subj_cd) {
        this.subj_cd = subj_cd;
    }

    public String getSubj_nm() {
        return subj_nm;
    }

    public void setSubj_nm(String subj_nm) {
        this.subj_nm = subj_nm;
    }

    public String getCurr_typ() {
        return curr_typ;
    }

    public void setCurr_typ(String curr_typ) {
        this.curr_typ = curr_typ;
    }

    public String getCurr_typ_nm() {
        return curr_typ_nm;
    }

    public void setCurr_typ_nm(String curr_typ_nm) {
        this.curr_typ_nm = curr_typ_nm;
    }

    public Timestamp getReg_dttm() {
        return reg_dttm;
    }

    public void setReg_dttm(Timestamp reg_dttm) {
        this.reg_dttm = reg_dttm;
    }
}
