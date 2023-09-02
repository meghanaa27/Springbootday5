package com.meghana.Springbootday5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
  
import com.meghana.Springbootday5.model.*;
import com.meghana.Springbootday5.service.*;

@RestController
public class ApiController {
	@Autowired
	BookServe serve;
	
	@PostMapping("add")
	public Book add(@RequestBody Book bk)
	{
		return serve.saveBook(bk);
	}
	@PostMapping("/")
	public boolean addDet(@RequestBody List<Book> bk)
	{
		return serve.savedetails(bk)!=null;
	}
	@GetMapping("/")
	public List<Book> show()
	{
		return serve.showBook();
	}
	@GetMapping("{id}")
	public Optional<Book> showid(@PathVariable int id) {
		return serve.getid(id);
	}
	
	@PutMapping("/")
	public Book modify(@RequestBody Book bk) {
		return serve.changeinfo(bk);
	}
	@DeleteMapping("/{id}")
	public void delid(@PathVariable int id) {
		serve.deleteid(id);
	}
	@PutMapping("/{id}")
	public String modbyid(@PathVariable int id,@RequestBody Book bk) {
		return serve.updatebyid(id, bk);
	}
}
