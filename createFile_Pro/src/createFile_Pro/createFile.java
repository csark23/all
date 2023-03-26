package createFile_Pro;

import java.io.*;

public class createFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\Practice\\Java\\fileCreate\\test2.txt");
//		=================Using Try catch ===============
//		try {
//			if(f.createNewFile()) {
//				System.out.println("File Successfully Create...!");
//			}else {
//				System.out.println("File Already Exit...!");
//			}
//		}catch(IOException i) {
//			System.out.println("Exception handeled..!");
//		}
		if(f.createNewFile()) {
			System.out.println("File Successfully Create...!");
		}else {
			System.out.println("File Already Exit...!");
		}
	}
}
