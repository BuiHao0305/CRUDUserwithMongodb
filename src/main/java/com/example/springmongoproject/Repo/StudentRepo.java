package com.example.springmongoproject.Repo;

import com.example.springmongoproject.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {

}
