package com.example.am;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.am.entity.Book;
import com.example.am.repo.BookRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		BookRepo bean = context.getBean(BookRepo.class);
		System.out.println(bean.getClass().getName());
		
		Book b=new Book();
		b.setBookId(103);
		b.setBookName("Spring Boot");
		b.setBookPrice(1200.99);
		
		bean.save(b);//upsert method----both update and insert
	}

}
