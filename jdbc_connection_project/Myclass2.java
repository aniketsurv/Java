package jdbc_connection_project;

import java.sql.Statement;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Myclass2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ajit", "root", "root");
		Statement st = connection.createStatement();
		Scanner sc=new Scanner(System.in);
		int rn=sc.nextInt();
		sc.nextLine();
		String name=sc.nextLine();
		int marks=sc.nextInt();
		String query = "INSERT INTO `ajit`.`student` (`id`, `name`, `marks`) VALUES ("+rn+", '"+name+"', "+marks+")";
		int rs = st.executeUpdate(query);
		System.out.println(rs);
		
	}

}
