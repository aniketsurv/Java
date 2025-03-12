package gto;

public class Gtoyoga
{
	public static void main(String[] args) 
	{
		//const.5
		Student yogesh = new Student("Yogesh", 35, 'B');
        Student narayan = new Student("Narayan", 76);
        Student mahesh = new Student("Mahesh");

        Student kiran = new Student("Kiran");
                
        System.out.println("Name = " + yogesh.name + ", section = " + yogesh.section + ", marks = " + yogesh.marks);

        System.out.println("Name = " + narayan.name + ", section = " + narayan.section + ", marks = " + narayan.marks);

        System.out.println("Name = " + mahesh.name + ", section = " + mahesh.section + ", marks = " + mahesh.marks);

        System.out.println("Name = " + kiran.name + ", section = " + kiran.section + ", marks = " + kiran.marks);
	}	
}

class Student
{
    String name;
    int marks;
    char section;
    
    Student(String nameParam, int marksParam, char sectionParam)
    {
        name = nameParam;
        marks = marksParam;
        section = sectionParam;
    }
    
    Student(String nameParam, int marksParam)
    {
        name = nameParam;
        marks = marksParam;
        section = 'A';
    }
    
    Student(String nameParam)
    {
        name = nameParam;
        marks = 0;
        section = 'A';
    }

    Student()
    {
        name = "Kiran";
        section = 'C';
    }
}
