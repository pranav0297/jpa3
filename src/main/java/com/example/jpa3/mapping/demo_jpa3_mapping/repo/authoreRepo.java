package com.example.jpa3.mapping.demo_jpa3_mapping.repo;

import com.example.jpa3.mapping.demo_jpa3_mapping.author;
import org.springframework.data.repository.CrudRepository;

public interface authoreRepo extends CrudRepository<author,Integer> {
}
