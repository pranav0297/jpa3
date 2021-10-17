package com.example.jpa3_manytomany.demo_manytomany.repo;

import com.example.jpa3_manytomany.demo_manytomany.Author;
import org.springframework.data.repository.CrudRepository;

public interface authorRepo extends CrudRepository<Author,Integer> {
}
