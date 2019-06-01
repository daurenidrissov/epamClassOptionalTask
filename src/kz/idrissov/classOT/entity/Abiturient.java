package kz.idrissov.classOT.entity;

import kz.idrissov.classOT.action.AbiturientAction;

public class Abiturient{
    private int id;
    private String surname;
    private String name;
    private String fname;
    private String address;
    private String phone;
    private float[] grades;

    public Abiturient(int id, String surname, String name, String fname, String address, String phone, float... grades) {
        this.setId(id);
        this.setSurname(surname);
        this.setName(name);
        this.setFname(fname);
        this.setAddress(address);
        this.setPhone(phone);
        this.setGrades(grades);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float[] getGrades() {
        return grades;
    }

    public void setGrades(float[] grades) {
        this.grades = grades;
    }
}
