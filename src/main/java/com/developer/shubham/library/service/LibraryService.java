package com.developer.shubham.library.service;

import java.util.List;
import java.util.Optional;

import com.developer.shubham.library.model.Book;

public interface LibraryService {

	Optional<Book> getBookById(Integer Id);
	
	List<Book> getBookAllBooks();
	
}
