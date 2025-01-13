package com.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("Welcome to Student Managemet app");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("PRESS 1 to ADD student");
			System.out.println("PRESS 2 to Delete student");
			System.out.println("PRESS 3 to Dispay student");
			System.out.println("PRESS 4 to Dispay student"); // create all itself

			System.out.println("PRESS 5 to Exit to App");

			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// Add Student..
				System.out.println("Enter user name :");
				String name = br.readLine();

				System.out.println("Enter user phone :");
				String phone = br.readLine();

				System.out.println("Enter user City :");
				String city = br.readLine();

				// create student object to store student
				Student st = new Student(name, phone, city);

				boolean answer = StudentDao.insertStudentToDB(st);
				if (answer) {
					System.out.println("Student added successfuly....");

				} else {
					System.out.println("Somthing went wrong...");

				}

				System.out.println(st);

			} else if (c == 2) {
				// Delate student..

				System.out.println("Enter student id to delete: ");
				int userId = Integer.parseInt(br.readLine());
				boolean ans = StudentDao.delateStudentToDB(userId);
				if (ans) {
					System.out.println("Student Deleated successfuly....");

				} else {
					System.out.println("Somthing went wrong...");

				}

			} else if (c == 3) {

				// Dispaly the student...
				StudentDao.showAllStudent();

			} else if (c == 5) {

				// Exit
				break;

			} else {

			}

		}
		System.out.println("Thankyou for using my application....");
		System.out.println("See you soon...bye bye");

	}

}
