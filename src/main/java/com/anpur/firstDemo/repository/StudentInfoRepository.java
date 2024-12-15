package com.anpur.firstDemo.repository;

import com.anpur.firstDemo.domain.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInfoRepository extends ReactiveCrudRepository<Student ,Integer> {
}
