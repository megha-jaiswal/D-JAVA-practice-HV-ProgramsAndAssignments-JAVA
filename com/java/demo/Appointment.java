package com.java.demo;

import java.util.Date;

public class Appointment {
    private Date schedule;
    private String comment;

    public Appointment(Date schedule, String comment) {
        this.schedule = schedule;
        this.comment = comment;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "schedule=" + schedule +
                ", comment='" + comment + '\'' +
                '}';
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
