package com.example.jpa3.mapping.demo_jpa3_mapping;

import com.example.jpa3.mapping.demo_jpa3_mapping.repo.authoreRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.HashSet;

@SpringBootTest
class DemoJpa3MappingApplicationTests {

	@Autowired
	authoreRepo repo;


	@Test
	void contextLoads() {
	}


	@Test
	void CreateAuthore(){
		author a = new author();
		author b = new author();
		author c = new author();
		 a.setName("A");
		 b.setName("B");
		 c.setName("C");

		 address ad1 = new address();
		 ad1.setStreetNumber("1234");
		 ad1.setState("up");
		 ad1.setLocation("india");
		a.setAddress1(ad1);

		address ad2 = new address();
		ad2.setStreetNumber("12345");
		ad2.setState("dl");
		ad2.setLocation("india");
		b.setAddress1(ad2);

		address ad3 = new address();
		ad3.setStreetNumber("123456");
		ad3.setState("uk");
		ad3.setLocation("india");
		c.setAddress1(ad3);

		HashSet<books> book = new HashSet<>();
		HashSet<books> book_2 = new HashSet<>();
		HashSet<books> book_3 = new HashSet<>();


		books book1 = new books();
		book1.setBookname("c1");
		book1.setAuthore(a);
		book.add(book1);

		books book2 = new books();
		book2.setBookname("Java1");
		book2.setAuthore(a);
		book.add(book2);

		books book3 = new books();
		book3.setBookname("Python1");
		book3.setAuthore(a);
		book.add(book3);



		books book1_2 = new books();
		book1_2.setBookname("c2");
		book1_2.setAuthore(b);
		book_2.add(book1_2);

		books book2_2 = new books();
		book2_2.setBookname("Java2");
		book2_2.setAuthore(b);
		book_2.add(book2_2);

		books book3_2 = new books();
		book3_2.setBookname("Python2");
		book3_2.setAuthore(b);
		book_2.add(book3_2);



		books book1_3 = new books();
		book1_3.setBookname("c");
		book1_3.setAuthore(c);
		book_3.add(book1_3);

		books book2_3 = new books();
		book2_3.setBookname("Java");
		book2_3.setAuthore(c);
		book_3.add(book2_3);

		books book3_3 = new books();
		book3_3.setBookname("Python");
		book3_3.setAuthore(c);
		book_3.add(book3_3);


		a.setBooksSet(book);
		b.setBooksSet(book_2);
		c.setBooksSet(book_3);

		repo.save(a);
		repo.save(b);
		repo.save(c);

	}

}
