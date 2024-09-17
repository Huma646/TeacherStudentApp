package com.example.Teacher_Student.controller;

import com.example.Teacher_Student.entity.Teacher;
import com.example.Teacher_Student.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

@RequestMapping("/api/v1")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers")
    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @GetMapping("teachers/{id}")
    public ResponseEntity<Teacher> getTeacherById(@PathVariable int id) {
        Teacher teacher = teacherService.getTeacherById(id);
        return ResponseEntity.ok(teacher);
    }

@PostMapping("/teachers")
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.createTeacher(teacher);
    }
    @PutMapping("teachers/{id}")
    public ResponseEntity<Teacher> updateTeacher(@PathVariable int id, @RequestBody Teacher teacherDetails) {
        Teacher updatedTeacher = teacherService.updateTeacher(id, teacherDetails);
        return ResponseEntity.ok(updatedTeacher);
    }
    // DELETE a teacher
    @DeleteMapping("teachers/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteTeacher(@PathVariable int id) {
        teacherService.deleteTeacher(id);
        Map<String,Boolean>response=new HashMap<>();
        response.put("Teacher deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }

}
