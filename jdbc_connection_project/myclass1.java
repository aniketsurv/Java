package jdbc_connection_project;

import java.sql.Statement;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class myclass1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/ajit";
		String username = "root";
		String password = "root";
		Connection  connection=DriverManager.getConnection(url,username,password);
	Statement st=connection.createStatement();
	String query="select * from student";
	ResultSet rs=st.executeQuery(query);
	List<Student>list=new ArrayList<>();
	while (rs.next()) {
		int id=rs.getInt(1);
		String name=rs.getString(2);
		int marks=rs.getInt(3);
		Student s=new Student(id,name,marks);
		list.add(s);
		
	}
	System.out.println(list);
	
	}

}
