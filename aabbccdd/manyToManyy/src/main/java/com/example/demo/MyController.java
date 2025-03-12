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
	LanguageRepo lRepo;

	@RequestMapping("creatLnag")
	public String creatLnag(@RequestBody Language l1)
	{
		lRepo.save(l1);
		return"Lang. Reaty To Learn";
	}

	@RequestMapping("creatStudent")
	public String creatStudent(@RequestBody Student s1)
	{
		sRepo.save(s1);
		return"studentAdded";
	}
	@RequestMapping("CreatStudent{langid}")
	public String CreatStudent(@PathVariable int langid,@RequestBody Student s2)
	{
		Language l	=	lRepo.findById(langid).get();
		l.list.add(s2);
		sRepo.save(s2);
		lRepo.save(l);

		return "created";

	}
	@RequestMapping("maping{langid}/{studentid}")
	public String maping(@PathVariable int langid,@PathVariable int studentid)
	{
		Language l2=lRepo.findById(langid).get();
		Student s2=sRepo.findById(studentid).get();
		l2.list.add(s2);

		lRepo.save(l2);
		return "mapingDone..";
	}

	@RequestMapping("updateTime{studentid}/{time}")
	public String updateTime(@PathVariable int studentid,@PathVariable String time)
	{
		Student s=sRepo.findById(studentid).get();
		s.setTime(time);
		sRepo.save(s);
		return"TimeUpdated..";

	}
	
	@RequestMapping("readBatch{langid}")
	public List<Student> readBatch(@PathVariable int langid)
	{
		return lRepo.findById(langid).get().getList();
	}


}
