package com.example.demo.repository;

import com.example.demo.dto.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

public interface StudentRepository {
    public Student findById(long id);
    public void saveStudent(long id, Student student);
    public void updateStudent(long id, Student student);
    public void deleteStudent(long id);
}
