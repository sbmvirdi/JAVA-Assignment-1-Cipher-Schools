package com.example.demo12;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
	
	
	@Autowired
	private BookServices bservice;
	
	
@CrossOrigin
	@RequestMapping("/book")
	public java.util.List<Book> getAllBooks() {
		
		return bservice.getAllBooks();
	
	}

@CrossOrigin
	@RequestMapping("/book/{id}") 
	public Optional<Book> getBook(@PathVariable String id) {
	
		return bservice.getBook(id);
		
	}
@CrossOrigin
	@RequestMapping(method=RequestMethod.POST,value="/book")
	public void addBook(@RequestBody Book newmov)
	{
		bservice.addBook(newmov);
	}
@CrossOrigin
	@RequestMapping(method=RequestMethod.DELETE,value="/book/{id}")
	public void deleteBook(@PathVariable String id)
	{
		bservice.deleteBook(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/book/{id}")
	public void updateMovie(@RequestBody Book newmov,@PathVariable String id)
	{
		bservice.updateMovie(newmov,id);
	}
	

}
