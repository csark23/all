package test;

public class Student {
	int studentId;
	String studentName;
	String studentCity;
	
	public Student() {
		System.out.println("creating object: non-para");
		System.out.println("");
	}
	public Student(int st) {
		System.out.println("Parameterizing constructor:(int x)");
		System.out.println("");
	}
	public Student(int i, String n,String c) {
		studentId=i;
		studentName=n;
		studentCity=c;
	}
	public void study() {
		System.out.println(studentName+" is studing");
	}
	
	public void showfullDetails() {
		System.out.println("My name is "+studentName);
		System.out.println("My id is "+studentId);
		System.out.println("My city is "+studentCity);
	}
}
