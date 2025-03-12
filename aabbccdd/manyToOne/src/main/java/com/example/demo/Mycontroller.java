package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {
	
	@Autowired
	StudentRepo sRepo;
	
	@Autowired
	BatchRepo bRepo;
	
	@RequestMapping("addBa")
	public String creatBatch(@RequestBody Batch b)
	{
		
		bRepo.save(b);
		return"BatchCreatedParfect..";
	}
	
	@RequestMapping("creatStudent{batchid}")
	public String creatStudent(@PathVariable int batchid,@RequestBody Student s1)
	{
		Batch b=bRepo.findById(batchid).get();
		s1.batch=b;
		sRepo.save(s1);
	  return"StudentCreated";
	}
	
	@RequestMapping("update{studentid}/{batchid}")
	public String update(@PathVariable int studentid,@PathVariable int batchid)
	{
		Student s=sRepo.findById(studentid).get();
		Batch b=bRepo.findById(batchid).get();
		s.setBatch(b);
		sRepo.save(s);
		
		return "updated";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
