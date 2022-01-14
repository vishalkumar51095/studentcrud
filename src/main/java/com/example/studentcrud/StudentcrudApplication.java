package com.example.studentcrud;

import com.example.studentcrud.domain.Student;
import com.example.studentcrud.repository.StudentRepository;
import org.aspectj.apache.bcel.Repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentcrudApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(StudentcrudApplication.class, args);
		//context.getbean(StudentRepository.class);
		StudentRepository userRepository=context.getBean(StudentRepository.class);

		Student user=new Student();
		user.setStudentname("Vishal");
		user.setFee(25000);
		user.setCourse("Mca");

		Student user1=userRepository.save(user);

		System.out.println(user1);
	}

}
