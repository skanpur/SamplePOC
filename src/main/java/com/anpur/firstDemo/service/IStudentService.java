package com.anpur.firstDemo.service;

import com.anpur.firstDemo.domain.Student;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IStudentService {
    Mono<Student> saveStudent(Student student);

    Flux<Student> getAllStudents();

    Mono<Student> getStudentById(Integer id);

    Mono<Void> deleteStudent(Integer id);
}
