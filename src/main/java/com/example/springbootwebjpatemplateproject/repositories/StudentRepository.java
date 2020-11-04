package com.example.springbootwebjpatemplateproject.repositories;

import com.example.springbootwebjpatemplateproject.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository
    extends CrudRepository<Student, Integer> {
}
