package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
public class Batch {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String trainer;
	
	@OneToMany
	List<Student>list;
	
}
