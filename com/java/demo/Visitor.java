package com.java.demo;

public class Visitor {
    private int id;
    private String visitorName;
    private String address;
    private long contactNo;
    private Appointment appointment;

    public Visitor(int id, String visitorName, String address, long contactNo, Appointment appointment) {
        this.id = id;
        this.visitorName = visitorName;
        this.address = address;
        this.contactNo = contactNo;
        this.appointment = appointment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id=" + id +
                ", visitorName='" + visitorName + '\'' +
                ", address='" + address + '\'' +
                ", contactNo=" + contactNo +
                ", appointment=" + appointment +
                '}';
    }
}
