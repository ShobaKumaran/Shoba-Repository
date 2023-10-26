package week1.day1;
/*
 * 
Assignment:5
=========
Create Class Student
declare variables
studentName
rollNo
collegeName
markScored
cgpa

Create a class Report and 
create object for student class in main method and print all the variables

 * */



public class Student {

	String studentName = "Neha";
	int rollNo = 12345;
	String collegeName = "UCLA";
	float markScored = 97.5f;
	float cgpa = 9.5f; 
	
	
	public static void main(String[] args) {
		
		Student person = new Student();
		System.out.println("........................");
		System.out.println("Student Report for " +person.studentName);
		System.out.println("........................");
		System.out.println("");
		System.out.println("Roll No:" + person.rollNo);
		System.out.println("College Name:" + person.collegeName);
		System.out.println("Mark Scored:" + person.markScored);
		System.out.println("CGPA:" + person.cgpa);
			
		
	}
}
