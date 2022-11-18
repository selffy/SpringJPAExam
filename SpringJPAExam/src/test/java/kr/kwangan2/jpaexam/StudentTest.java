package kr.kwangan2.jpaexam;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import com.querydsl.core.BooleanBuilder;

import kr.kwangan2.jpaexam.entity.QStudent;
import kr.kwangan2.jpaexam.entity.Student;
import kr.kwangan2.jpaexam.repository.DynamicRepository;
import kr.kwangan2.jpaexam.repository.StudentRepository;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@Log4j2
@SpringBootTest
class StudentTest {

	@Autowired
	private StudentRepository repository;
	
	@Autowired
	private DynamicRepository dynamicrepo;
	
	//insert
//	@Test
//	public void insertStudentTest() {
//		Student student = new Student(0L,"지은",24,"초량",new Date());
//		repository.save(student);
//		log.info(student);
//		repository.save(student);
//	}
	
	//select
//	@Test
//	public void selectStudentTest() {
//		Student student = repository.findById(1L).get();
//		log.info(student.toString());
//	}
	
	//update
	//@Test
//	public void updateStudentTest() {
//		Student student = repository.findById(2L).get();
//		
//		student.setAddr("센텀이사");
//		repository.save(student);
//	}
	
	//delete
//	@Test
//	public void deleteStudentTest() {
//		Student student = repository.findById(3L).get();
//		
//		repository.deleteById(3L);
//	}
	
	//paging
//	@Test
//	public void findByNameContainingTest() {
//		Pageable paging = PageRequest.of(1, 5);
//		List<Student> studentList = repository.findByNameContaining("학생", paging);
//		
//		for(Student student : studentList) {
//			log.info(student.toString());
//		}
//	}

	//Sorting
//	@Test
//	public void queryAnnotationTest() {
//		Pageable paging = PageRequest.of(1, 5, Sort.Direction.DESC, "sid");
//		List<Student> studentList = repository.queryAnnotationTest(paging);
//		
//			for(Student student : studentList) {
//			log.info(student.toString());
//		}
//	}
	
	//동적쿼리
	@Test
	public void DynmaicQuerytest() {
		String searchCondition = "NAME";
		String searchname = "학생10";
		
		BooleanBuilder builder = new BooleanBuilder();
				
		QStudent qStudent = QStudent.student;
		
		if(searchCondition.equals("NAME")){
			builder.and(qStudent.name.like("%" + searchname + "%"));
		}else if(searchCondition.equals("ADDR")) {
			builder.and(qStudent.addr.like("%" + searchname + "%"));
		}
		
		Pageable paging = PageRequest.of(1, 5);
		
		Page<Student> studentList = dynamicrepo.findAll(builder, paging);
		
		for(Student student : studentList) {
			log.info(student.toString());
		}
		
	}
}
