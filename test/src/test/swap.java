package test;

import java.util.Scanner;

public class swap {

	static void swapvalues(int m,int n) {
		int temp=m;
		m=n;
		n=temp;
		System.out.println("Values of m is "+m +" and values of n is "+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the m value: ");
		Scanner m1 = new Scanner(System.in);
		int m=m1.nextInt();
		System.out.print("Enter the n value: ");
		Scanner n1=new Scanner(System.in);
		int n=n1.nextInt();
		swapvalues(m,n);
		
	}

}
