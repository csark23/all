package test2;

import java.util.Scanner;

public class revestr {

	private static void reverse(char[] str, int start, int end) {
		// TODO Auto-generated method stub
		char temp;
		while(start<=end) {
			temp=str[start];
			str[start]=str[end];
			str[end]=temp;
			start++;
			end--;
		}
	}
	
	private static char[] reverserWords(char[] s) {
		// TODO Auto-generated method stub
		int start = 0;
		for(int end=0;end<s.length;end++) {
			if(s[end] == ' ') {
				reverse(s,start,end);
				start = end+1;
			}
		}
		reverse(s,start,s.length-1);
		reverse(s,0,s.length-1);
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st =new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s = st.nextLine();
		
		char[] p =reverserWords(s.toCharArray());
		System.out.println(p);
	}



}
