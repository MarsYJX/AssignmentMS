package com.model;

import java.util.Date;

public class AssignmentInfo {

    private long id;
    private String question;
    private Date releaseTime;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String getQuestion(){
        return question;
    }

    public void setQuestion(String question){
        this.question = question;
    }

    public Date getReleaseTime(){
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime){
        this.releaseTime = releaseTime;
    }

}
