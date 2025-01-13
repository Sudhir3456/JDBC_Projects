package com.student.manage;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

	public static boolean insertStudentToDB(Student st) {
		boolean f = false;

		try {
			// jdbc code
			Connection con = CP.createC();
			String q = "insert into students(snme,sphone,scity) values(?,?,?)";
			// PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);

			// set the value parameter
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentName());
			pstmt.setString(3, st.getStudentCity());

			// Ececute...
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {

		}

		return f;

	}

	public static boolean delateStudentToDB(int userId) {
		boolean f = false;

		try {
			// jdbc code
			Connection con = CP.createC();
			String q = "delete from students where sid=?";
			// PreparedStatement
			PreparedStatement pstmt = con.prepareStatement(q);

			// set the value parameter
			pstmt.setInt(1, userId); // id is integer so take setint

			// Ececute...
			pstmt.executeUpdate();
			f = true;

		} catch (Exception e) {

		}

		return f;

	}

	public static void showAllStudent() {
		// TODO Auto-generated method stub
		try {
			// jdbc code
			Connection con = CP.createC();
			String q = "Select * from students;";
			Statement stmt = con.createStatement();
			ResultSet set = stmt.executeQuery(q);

			while (set.next()) {
				int id = set.getInt(1); // 1 because sid in 1st colun in db

				String name = set.getString(2);
				String phone = set.getNString(3);
				String city = set.getNString(4);

				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("phone : " + phone);
				System.out.println("City : " + city);
				System.out.println("====================================================================");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
