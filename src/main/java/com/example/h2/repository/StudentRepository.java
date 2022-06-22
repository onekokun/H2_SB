package com.example.h2.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.h2.model.Student;
public interface StudentRepository extends CrudRepository<Student, Integer>
{
}