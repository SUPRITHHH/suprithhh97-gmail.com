package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.di.Author;
import com.tyss.springcore.di.Book;

@Configuration
public class ConfigurationBook {

	@Bean(name="book")
	public Book getbook() {
		Book book = new Book();
		book.getAuthor();
		book.setName("The Piece");
		book.setPrice(25.00);
		return book;	
	}
	
	@Bean(name="author")
	public Author getauthor() {
		Author author = new Author();
		author.setName("Pramod");
		author.setPenName("Cellone");
		return author;
	}
}
