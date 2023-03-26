package createFile_Pro;

import java.io.*;

public class fileWrite {
	public static void main(String[] args) {
		File f=new File("D:\\Practice\\Java\\fileCreate\\test3.txt");
		try {
			f.write("Java programing is the best language..!");
			finally {
				f.close(){
					f.close();
				}
			}
		}catch() {
			
		}
	}
}
