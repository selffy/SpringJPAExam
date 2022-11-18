package kr.kwangan2.jpaexam.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Student {
	
	public Student(Long sid,String name,Integer age,String addr,Date regDate) {
		this.sid = sid;
		this.name=name;
		this.age=age;
		this.addr=addr;
		this.regDate=regDate;
	
	}
	
	@Id
	@GeneratedValue
	private Long sid;
	private String name;
	private Integer age;
	private String addr;
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date regDate;
	
}//class
