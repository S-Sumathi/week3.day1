package org.student;

//Imported department package
import org.department.Department;

//Inherited Department Class
public class Student extends Department  {

	//Methods of Student class
	public void studentName()
	{
		System.out.println("Sumathi");
		
	}
	public void studentDept()
	{
		System.out.println("EEE");
	}
   public void studentId()
   {
	   System.out.println("123345");
   }
   
   //All the methods are implemented using multilevel inheritance
	public static void main (String[] args) {
		Student objStud=new Student();
		objStud.collegeCode();
		objStud.collegeName();
		objStud.collegeRank();
		objStud.deptName();
		objStud.studentDept();
		objStud.studentId();
		objStud.studentName();
	}
	}


