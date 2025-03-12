package com.org.edu.admin;

public class Teacher {
	
	String teacherName;
	int age;
	String subjectName;
	String address;
	String qualification;
	
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	
	public Teacher(String teacherName)
	{
		this.teacherName=teacherName;
	}
	
	public Teacher(String teacherName,int age)
	{
		this(teacherName);
		this.age=age;
	}
	
	public Teacher(String teacherName,int age,String subjectName)
	{
		this(teacherName, age);
		this.subjectName=subjectName;
	}
	
	public Teacher(String teacherName,int age,String subjectName,String address)
	{
		this(teacherName, age, subjectName);
		this.address=address;
	}
	
	public Teacher(String teacherName,int age,String subjectName,String address,String qualification)
	{
		this(teacherName, age, subjectName, address);
		this.qualification=qualification;
	}
	
	public static void main()
	{
		
	}
	
	public static void main(String[] a)
	{
		Teacher t = new Teacher("SWARUP");
		
		Teacher t1 = new Teacher();
		t.teacherName="SWARUP";
	}
	
	public void teaching()
	{
		System.out.println("TEACHING SUBJECT NAME : "+this.subjectName);
	}
	
	public void teaching(String subjectName)
	{
		
	}
	
	
	void eventManagement()
	{
		
	}
	
	

}
