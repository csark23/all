package test;

class Building {}
class House extends Building{}

public void convert() {
	Building b = new Building();
	House h = new House();
	Building bh = new House();
	House p = (House) b;
	House q = (House) h;
	House r = (House) bh;
}

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
