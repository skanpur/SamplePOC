package com.anpur.firstDemo.service;

import com.anpur.firstDemo.domain.Student;
import com.anpur.firstDemo.repository.StudentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentInfoRepository studentInfoRepository;

    @Override
    public Mono<Student> saveStudent(Student student)
    {
        return studentInfoRepository.save(student);
    }

    @Override
    public Flux<Student> getAllStudents()
    {
        return studentInfoRepository.findAll();
    }

    @Override
    public Mono<Student> getStudentById(Integer id)
    {
        return studentInfoRepository.findById(id);
    }

    @Override
    public Mono<Void> deleteStudent(Integer id)
    {
        return studentInfoRepository.deleteById(id);
    }


}
