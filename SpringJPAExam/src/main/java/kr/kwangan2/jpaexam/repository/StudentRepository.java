package kr.kwangan2.jpaexam.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import kr.kwangan2.jpaexam.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

	List<Student> findByNameContaining(String searchname, Pageable paging);

	@Query("select s from Student s order by s.sid desc")
	List<Student> queryAnnotationTest(Pageable paging);
}

