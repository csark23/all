package test;

public class stu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student str1=new Student();
		
		str1.studentName="Ram";
		str1.studentId=02;
		str1.studentCity="Kolkata";
		
		str1.study();
		str1.showfullDetails();
		
		Student str2 = new Student(2);
		str2.studentId=741;
		str2.studentName="Shyam";
		str2.studentCity="Mumbai";
		str2.study();
		str2.showfullDetails();
		
		Student str3 = new Student(700,"Sita","patna");

		str3.study();
		str3.showfullDetails();
	}

}
