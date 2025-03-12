package june27constracter;


public class MyClass
{
	public static void main(String[] args) 
	{
		//cons.4
		Student narayan = new Student();
        Student mahesh = new Student("Mahesh", 98, 'C');
        Student kiran = new Student("Kiran", 'A');
        
        kiran.print("Kiran", 'A');
        mahesh.print("Mahesh", 'B', 65);
        narayan.print();
	}
}

class Student
{
    String name;
    int marks;
    char section;

    Student(String name, int marks, char section)
    {
        this.name = name;
        this.section = section;
        this.marks = marks;
    }

    Student(String name, char section)
    {    
        this(name, 0, section);
    }

    Student()
    {
        this("Narayan", 95, 'A');
    }

    void print()
    {
        System.out.println("Name = " + name + ", marks = " + marks);
    }

    void print(String name, char section)
    {
        System.out.println("Name = " + name + ", section = " + section);
    }
    
    void print(String name, char section, int marks)
    {
        System.out.println("Name = " + name + ", section = " + section + ", marks = " + marks);
    }
}