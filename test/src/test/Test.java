package test;

public class Test{

public static int i = 0;

public static void main(String[] args){
Test firstInst = new Test();
firstInst.i = 1;
Test secondInst = new Test();
System.out.println(secondInst.i);

}

}