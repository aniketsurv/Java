package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Student {
	@Id
	
	int id;
	String name;
	int marks;
	
	
	
	@ManyToOne
	Batch batch;

}
