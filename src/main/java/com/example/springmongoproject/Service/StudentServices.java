package com.example.springmongoproject.Service;

import com.example.springmongoproject.Entity.Student;
import com.example.springmongoproject.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private StudentRepo studentRepo;

    public void saveorUpdate(Student student) {
        studentRepo.save(student);
    }

    public List<Student> listAll() {
        return studentRepo.findAll();
    }

    public void delete(String id) {
        studentRepo.deleteById(id);
    }

    public Student getStudentById(String id) {
        return studentRepo.findById(id).orElse(null);
    }
}
