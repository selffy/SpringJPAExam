package kr.kwangan2.jpaexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(StudentApplication.class);
		application.setWebApplicationType(WebApplicationType.SERVLET);
		application.run(args);
	}

}
