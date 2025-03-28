package com.example.demo.repository;

import com.example.demo.dto.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentMemoryRepository implements StudentRepository{
    private Map<Long, Student> studentMap = new HashMap<>();

    public Student findById(long id){
        return studentMap.get(id);
    }
    public void saveStudent(long id, Student student){
        studentMap.put(id,student);
    }
    public void updateStudent(long id, Student student){
        studentMap.replace(id,student);
    }
    public void deleteStudent(long id){
        studentMap.remove(id);
    }
}