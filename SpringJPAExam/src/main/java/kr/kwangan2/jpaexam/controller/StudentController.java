package kr.kwangan2.jpaexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/student")
	public String student() {
		return "student";
	}
}
