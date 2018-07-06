/**
 * 
 */
package com.naveen.web.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;

import com.mysql.jdbc.Statement;
import com.naveen.web.model.Student;

/**
 * @author admin
 *
 */
public class StudentDAO {
public Student getStudent(Integer stid){
	Student std=new Student();
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "admin", "password");
		java.sql.Statement st=con.createStatement();		
		ResultSet s=st.executeQuery("select * from student where id="+ stid);
		if(s.next()){
			std.setStid(s.getInt("id"));
			std.setName(s.getString("name"));
			std.setAge(s.getInt("age"));
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return std;
}
}
