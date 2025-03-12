package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	StudentRepo sRepo;
	
	@Autowired 
	BatchRepo bRepo;
	
	
	@RequestMapping("creatBatch")
	public String creatBatch(@RequestBody Batch b1)
	{
		
		bRepo.save(b1);
		return "BatchCreated";
	}
	
	@RequestMapping("creatStudent{batchid}")
	public String creatStudent(@PathVariable int batchid,@RequestBody Student s1)
	{
		Batch b1=bRepo.findById(batchid).get();
		
		b1.list.add(s1);
		sRepo.save(s1);
		bRepo.save(b1);
		
		return"StudentCreated";
	}
	@RequestMapping("updateStudent{Studentid}/{marks}")
	public String updateStudent(@PathVariable int Studentid,@PathVariable int marks)
	{
		Student s1=sRepo.findById(Studentid).get();
		
		s1.setMarks(marks);
		sRepo.save(s1);
		
		return"updateSucsessfuly...";
	}
	
	@RequestMapping("readBatch{Batchid}")
	public List<Student> readbatch(@PathVariable int Batchid)
	{
		
		return bRepo.findById(Batchid).get().getList();
	}
	
	@RequestMapping("readStudent{studentid}")
	public Student readStudent(@PathVariable int studentid)
	{
		return sRepo.findById(studentid).get();
	}
	@RequestMapping("delete{batchid}/{studentid}")
	public String delet(@PathVariable int batchid , @PathVariable int studentid)
	{
		sRepo.del(batchid, studentid);
		
		return"DeletSucsessfully...";
	}

}
