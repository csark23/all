package test2;

public class B {
	
	void show() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		B r=new B();
		System.out.println(r);
		r.show();
	}

}
