package kr.kwangan2.jpaexam.repository;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpaexam.entity.Student;

public interface DynamicRepository extends CrudRepository<Student, Long>, QuerydslPredicateExecutor<Student>{
	
}

