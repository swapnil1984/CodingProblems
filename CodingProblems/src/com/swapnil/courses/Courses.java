package com.swapnil.courses;

public class Courses {
	
	Course course;
	
	public Courses(Course course) {
		this.course = course;
	}
	
	static class Course{
		
		enum Status {
			INCOMPLETE,
			WITHDRAWN,
			COMPLETED
		}
		
		String name;
		int year;
		double mark;
		Status status;
		
		public Course() {
		
		}
		
		public Course(String name, int year, double mark, String status) {
			this.name = name;
			this.year = year;
			this.mark = mark;
			this.status = Status.valueOf(status);
		}
	
		public String getName() {
			return name;
		}
		
		public int getYear() {
			return year;
		}
		
		public double getMark() {
			return mark;
		}
		
		public Status getStatus() {
			return status;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public void setMark(double mark) {
			this.mark = mark;
		}

		public void setStatus(Status status) {
			this.status = status;
		}
	
		
		
		/*
		 * public void addCourse(Course course) { course. }
		 */
	}
}
