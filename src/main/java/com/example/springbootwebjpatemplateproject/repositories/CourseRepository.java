package com.example.springbootwebjpatemplateproject.repositories;

import com.example.springbootwebjpatemplateproject.models.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {
}
