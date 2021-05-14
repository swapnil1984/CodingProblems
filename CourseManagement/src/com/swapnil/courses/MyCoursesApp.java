package com.swapnil.courses;

import java.util.Scanner;

import com.swapnil.courses.Courses.Course;
import com.swapnil.courses.Courses.Course.Status;

public class MyCoursesApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Courses courses = new Courses(new Course());
		int input;
		int courseValue;
		
		System.out.println("How many courses do you want to create ?");
		input = scan.nextInt();
		
		for(int i = 0; i < input;i++) {
			
			while(true) {
				System.out.println("Enter Name for Course " + (i + 1));
				courses.course.name = scan.next();
					
					while(true) {
						System.out.println("Enter Marks for Course " + (i + 1));
						courses.course.mark = scan.nextDouble();
						
						while(true) {
							System.out.println("Enter Year for Course " + (i + 1));
							courses.course.year = scan.nextInt();
							
							while(true) {
								System.out.println("Enter Status for Course " + (i + 1));
								courses.course.status = Status.valueOf(scan.next());
								break;
							}
							break;
						}
						break;
					}
					break;
				}
			}
		
		//for (int i = 0;i < input;i++) {
			System.out.println(courses.course.getName());
			System.out.println(courses.course.getMark());
			System.out.println(courses.course.getYear());
			System.out.println(courses.course.getStatus());
		//}
		scan.close();

	}

}
