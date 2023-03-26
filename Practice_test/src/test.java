import java.util.Scanner;
public class test{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The string: " );
		String s = sc.nextLine();
		s=s.replaceAll("[-+.^:,]", "");
		System.out.println("String after removing all the white spaces: "+s);
		}
		
	}