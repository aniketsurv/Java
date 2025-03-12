package Studentarrys;

import java.util.Arrays;

public class Arrayclass {

	public Arrayclass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1(1, "kiran", 105);
		Student1 s2 = new Student1(2, "ajay", 70);
		Student1 s3 = new Student1(3, "yogish", 81);
		Student1 s4 = new Student1(4, "santosh", 67);
		Student1 a[] = { s1, s2, s3, s4 };
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i].marks>a[j].marks) {
					Student1 temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i].id+" "+a[i].name+" "+a[i].marks);
		}
	}

}
