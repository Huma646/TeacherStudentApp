package com.example.Teacher_Student.controller;


import com.example.Teacher_Student.entity.Student;
import com.example.Teacher_Student.entity.Teacher;
import com.example.Teacher_Student.service.StudentService;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("students/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
    @PutMapping("students/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student studentDetails) {
        Student updatedStudents = studentService.updateStudent(id, studentDetails);
        return ResponseEntity.ok(updatedStudents);
    }

    @DeleteMapping("students/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        Map<String,Boolean>response=new HashMap<>();
        response.put("Student deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
