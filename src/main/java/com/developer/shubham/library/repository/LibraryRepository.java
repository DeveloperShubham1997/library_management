package com.developer.shubham.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.developer.shubham.library.model.Book;

@Repository
public interface LibraryRepository extends JpaRepository<Book, Integer> {

}
