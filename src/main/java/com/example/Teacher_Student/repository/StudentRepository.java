package com.example.Teacher_Student.repository;

import com.example.Teacher_Student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
