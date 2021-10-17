package com.example.jpa3_manytomany.demo_manytomany;

import com.example.jpa3_manytomany.demo_manytomany.repo.authorRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;

@SpringBootTest
class DemoManytomanyApplicationTests {
	@Autowired
	authorRepo repo;


	@Test
	void contextLoads() {
	}

	@Test
	void createAuthor(){
		Author author = new Author();
		author.setName("A");

		HashSet<Books> hashSet = new HashSet<>();

		Books books = new Books();
		books.setBookname("java");
		hashSet.add(books);

		author.setBooks(hashSet);
		repo.save(author);

	}

}
