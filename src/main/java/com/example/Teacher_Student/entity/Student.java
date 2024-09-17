package com.example.Teacher_Student.entity;

import jakarta.persistence.*;


@Entity
    @Table(name = "student_info")
    public class Student {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @Column(name = "name")
        private String fullName;
    @Column(name = "institution")
        private String institution;
    @Column(name = "program")
        private String program;
    @Column(name = "emailid")
        private String emailId;

        public Student() {
        }

        public Student(String fullName, String institution, String program, String emailId) {
            this.fullName = fullName;
            this.institution = institution;
            this.program = program;
            this.emailId = emailId;
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

        public String getInstitution() {
            return institution;
        }

        public void setInstitution(String institution) {
            this.institution = institution;
        }

        public String getProgram() {
            return program;
        }

        public void setProgram(String program) {
            this.program = program;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }
    }

