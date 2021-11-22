package com.developer.shubham.library.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.shubham.library.model.Book;
import com.developer.shubham.library.repository.LibraryRepository;
import com.developer.shubham.library.service.LibraryService;

@Service
public class LibraryServiceImpl implements LibraryService{

	@Autowired
	LibraryRepository libraryRepository;
	
	@Override
	public Optional<Book> getBookById(Integer Id) {
		// TODO Auto-generated method stub
		return libraryRepository.findById(Id);
	}

	@Override
	public List<Book> getBookAllBooks() {
		// TODO Auto-generated method stub;
		return libraryRepository.findAll();
	}

}
