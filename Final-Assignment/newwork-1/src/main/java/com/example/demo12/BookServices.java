package com.example.demo12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServices {
	
	@Autowired
	BookRepository brepo;
	
	public List<Book> getAllBooks() {
		
		ArrayList<Book> allBooks=new ArrayList<>();
		
		brepo.findAll().forEach(allBooks::add);
		
		return allBooks;
	}
	
	public Optional<Book> getBook(String id) {
	
			return  brepo.findById(id);
		
	}
	public void addBook(Book mov)
	{
		brepo.save(mov);
	}

	public void deleteBook(String id) {
		
		brepo.deleteById(id);
		
	}

	public void updateMovie(Book newmov, String id) {
		
		brepo.save(newmov);
		
	}

}
