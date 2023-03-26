package test;

public class searching_last_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str0ring = "Hello world, Hello Reader";
		int lastIndex = str0ring.lastIndexOf("world");
		
		if(lastIndex == -1) {
			System.out.println("Hello not found");
			
		}else {
			System.out.println("Last occurrence of hello is at index "+lastIndex);
		}
	}

}
