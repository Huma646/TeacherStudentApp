package com.example.Teacher_Student.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "teacher_info")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "qualification")
    private String qualification;
    @Column(name = "salary")
    private double salary;
    @Column(name = "address")
    private String address;
    @Column(name = "emailid")
    private String email;

    public Teacher() {
    }

    public Teacher(String fullName, String qualification, double salary, String address, String email) {
        this.fullName = fullName;
        this.qualification = qualification;
        this.salary = salary;
        this.address = address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
