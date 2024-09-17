package com.example.Teacher_Student.service;

import com.example.Teacher_Student.entity.Student;
import com.example.Teacher_Student.entity.Teacher;
import com.example.Teacher_Student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id " + id));
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student updateStudent(int id, Student studentDetails) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));

        student.setFullName(studentDetails.getFullName());
        student.setInstitution(studentDetails.getInstitution());
        student.setProgram(studentDetails.getProgram());
        student.setEmailId(studentDetails.getEmailId());

        return studentRepository.save(student);
    }

    public void deleteStudent(int id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
        studentRepository.delete(student);
    }
}
