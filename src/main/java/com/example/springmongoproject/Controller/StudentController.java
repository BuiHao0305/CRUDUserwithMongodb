package com.example.springmongoproject.Controller;

import com.example.springmongoproject.Entity.Student;
import com.example.springmongoproject.Service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/student")
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        studentServices.saveorUpdate(student);
        return student;
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        return studentServices.listAll();
    }

    @PutMapping("/edit/{id}")
    public Student editStudent(@PathVariable String id, @RequestBody Student student) {
        student.setId(id);
        studentServices.saveorUpdate(student);
        return student;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentServices.delete(id);
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentServices.getStudentById(id);
    }
}
