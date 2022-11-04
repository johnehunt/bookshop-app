package com.informed.bookshop.main;

import com.informed.bookshop.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.informed.bookshop.config")
public class BookshopApplication {

	public static void main(String[] args) {
    System.out.println("======================");
    System.out.println("     Starting");
    System.out.println("======================");

    SpringApplication.run(BookshopApplication.class, args);

    System.out.println("======================");
    System.out.println("     Server Ready");
    System.out.println("======================");

    System.out.println("\thttp://localhost:8082/bookshop/books");
    System.out.println("\thttp://localhost:8082/bookshop/addresses");
	}

}
