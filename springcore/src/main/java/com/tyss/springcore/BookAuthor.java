package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.di.Author;
import com.tyss.springcore.di.Book;
import com.tyss.springcore.di.Hello;

public class BookAuthor {

	public static void main(String[] args) {
		
		
			ApplicationContext context = new ClassPathXmlApplicationContext("Book.xml");
			
             Book book = context.getBean(Book.class);
             System.out.println(book.getAuthor().getName());
             System.out.println(book.getAuthor().getPenName());
             System.out.println(book.getName());
             System.out.println(book.getPrice());
             
             
		}
	}

