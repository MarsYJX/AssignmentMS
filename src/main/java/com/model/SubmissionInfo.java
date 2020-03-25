package com.model;

import java.util.Date;

public class SubmissionInfo {

    private long sno;
    private long id;
    private String answer;
    private Date subTime;

    public long getSno(){
        return sno;
    }

    public void setSno(long sno){
        this.sno = sno;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getAnswer(){
        return answer;
    }

    public void setAnswer(String answer){
        this.answer=answer;
    }

    public Date getSubTime(){
        return subTime;
    }

    public void setSubTime(Date subTime){
        this.subTime = subTime;
    }
}
