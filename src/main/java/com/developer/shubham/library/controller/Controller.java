package com.developer.shubham.library.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.developer.shubham.library.model.Book;
import com.developer.shubham.library.service.LibraryService;

@RestController
public class Controller {

	@Autowired
	LibraryService libraryService;
	
	@GetMapping("v1/book/{id}")
	Optional<Book> getBook(@PathVariable int id) {
	
		System.out.println(libraryService.getBookById(id).toString());
		return libraryService.getBookById(id);
		//return null;
	}
	
	@GetMapping("v1/book/")
	ResponseEntity getAllBooks() {
		
		System.out.println(libraryService.getBookAllBooks());
		return null;
	}
}
