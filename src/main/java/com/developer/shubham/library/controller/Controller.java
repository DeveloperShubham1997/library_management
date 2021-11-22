package com.developer.shubham.library.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.developer.shubham.library.bean.AddBookRequest;
import com.developer.shubham.library.model.Book;
import com.developer.shubham.library.service.LibraryService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Controller {

	@Autowired
	LibraryService libraryService;
	
	@GetMapping("v1/book/{id}")
	public Optional<Book> getBook(@PathVariable int id) {
	
		System.out.println(libraryService.getBookById(id).toString());
		return libraryService.getBookById(id);
		//return null;
	}
	
	@GetMapping("v1/book/all")
	List<Book> getAllBooks() {
		
		 System.out.println(libraryService.getBookAllBooks());
		 return libraryService.getBookAllBooks();
	}
	
	@PostMapping("v1/book/add")
	public int addBook(@RequestBody AddBookRequest addBookRequest) {
		System.out.println(addBookRequest.toString());
		return libraryService.addBook(addBookRequest);
	}
}
