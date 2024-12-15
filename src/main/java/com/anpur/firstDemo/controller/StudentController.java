package com.anpur.firstDemo.controller;

import com.anpur.firstDemo.domain.Student;
import com.anpur.firstDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("name/{name}")
    private ResponseEntity<String> getStudentName(@PathVariable("name") String name) {
        return ResponseEntity.status(HttpStatus.OK).body(name);
    }

    @PutMapping
    public Mono<Student>
    saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public Flux<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Mono<Student>
    getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public Mono<Student>
    createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteStudent(@PathVariable Integer id) {
        return studentService.deleteStudent(id);
    }
}
