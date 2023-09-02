package com.meghana.Springbootday5.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.meghana.Springbootday5.model.*;
import com.meghana.Springbootday5.repository.*;

@Service
public class BookServe {
	@Autowired
	BookRepo rep;
	
	public Book saveBook(Book bk)
	{
		return rep.save(bk);
	}
	
	public List<Book> showBook(){
		return rep.findAll();
	}
	public List<Book> savedetails(List<Book> bk)
	{
		return (List<Book>)rep.saveAll(bk);
	}
	public Book changeinfo(Book bk)
	{
		return rep.saveAndFlush(bk);
	}
	public void deleteinfo(Book bk)
	{
		rep.delete(bk);
	}
	public void deleteid(int id)
	{
		rep.deleteById(id);
	}
	public void deletepid(int id)
	{
		rep.deleteById(id);
	}
	public Optional<Book> getid(int id) {
		return rep.findById(id);
	}public String updatebyid(int id,Book bk)
	{
		rep.saveAndFlush(bk);
		if(rep.existsById(id))
		{
			return "Updated Successfully !!!";
		}
		else
		{
			return "Enter the valid id";
		}
	}
}
