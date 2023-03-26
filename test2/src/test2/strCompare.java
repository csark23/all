package test2;

import java.util.Scanner;

public class strCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st = new Scanner(System.in);
		System.out.println("Enter 1st line");
		String s = st.nextLine();
		System.out.println("Enter 2nd line");
		String s1 = st.nextLine();
		String s2 ="Hello";
		String s3 ="Hello";
		System.out.println(s==s1); //false
		System.out.println(s2==s3); //true
		System.out.println(s.compareTo(s1));
	}

}
