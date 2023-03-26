package test;

public class stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "H";
		String anotherString = "G";
		Object objStr=str;
		
		System.out.println(str.compareTo(anotherString));
		System.out.println(str.compareToIgnoreCase(anotherString));
		System.out.println(str.compareTo(objStr.toString()));
		System.out.println(str.equals(anotherString));
	}

}
