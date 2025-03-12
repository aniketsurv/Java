package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
public class Batch {
	@Id
	int id;
	String name;
	String trainer;
	
	
	

}
