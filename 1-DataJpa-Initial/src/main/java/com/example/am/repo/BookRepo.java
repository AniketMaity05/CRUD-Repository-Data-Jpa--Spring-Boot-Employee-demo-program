package com.example.am.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.am.entity.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {

}
