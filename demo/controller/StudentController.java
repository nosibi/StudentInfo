package com.example.demo.controller;

import com.example.demo.dto.Student;

import com.example.demo.repository.StudentMemoryRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    StudentRepository studentRepository = new StudentMemoryRepository();

    //학생id로 학생 정보를 조회
    @GetMapping("/findStudent/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

    //학생 정보 저장
    @PostMapping("/saveStudent")
    public void saveStudent(@RequestBody Student student){
        studentRepository.saveStudent(student.getId(), student);
    }

    //학생 정보 수정
    @PutMapping("/updateStudent")
    public void updateStuent(@RequestBody Student student){
        studentRepository.updateStudent(student.getId(),student);
    }

    //학생 정보 삭제
    @DeleteMapping("/deleteStudent")
    public void deleteStudent(@RequestParam long id){
        studentRepository.deleteStudent(id);
    }
}
