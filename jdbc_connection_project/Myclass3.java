package jdbc_connection_project;

import java.sql.Statement;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Myclass3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajit", "root", "root");
		Statement st = connection.createStatement();
		int marks=50;
		String query="select count(*)from student where marks>"+marks;
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
			System.out.println(rs.getInt(1));
	}

}
