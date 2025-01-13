package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {

	static Connection con;

	public static Connection createC() {

		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");

			// Create the connection...
			String url = "Jdbc:mysql://localhost:3306/student_manage";
			String user = "root";
			String password = "Sudhir@0108";
			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return con;

	}
}
