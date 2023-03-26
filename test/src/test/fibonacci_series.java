package test;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3,count;
		System.out.println("Enter the count number: ");
		Scanner c = new Scanner(System.in);
		
		count=c.nextInt();
		
		System.out.print(n1+ " " + n2);
		for(int i=2;i<count;i++) {
			n3=n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
	}
}
