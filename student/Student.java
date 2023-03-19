package org.student;

import org.college.College;
import org.department.Department;

public class Student extends College{
	
	public void studentName() {
		System.out.println("Venkatesh");
	}
	public void studentDept() {
		System.out.println("ECE");
	}
	public void studentID() {
		System.out.println("194284");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std=new Student();
		std.collegeCode();
		std.collegeName();
		std.collegeRank();
		std.studentName();
		std.studentDept();
		std.studentID();
		Department dpt=new Department();
		dpt.departmentName();

	}

}
