package createFile_Pro;

import java.io.File;

public class fileHandel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\Practice\\Java\\fileCreate\\test2.txt");
		
		if(f.exists()) {
			System.out.println("FileName: "+f.getName());
			System.out.println("File Location: "+f.getAbsolutePath());
			System.out.println("File Writable: "+f.canWrite());
			System.out.println("File Readable: "+f.getName());
			System.out.println("File Size: "+f.length());
//			System.out.println("File Delete: "+f.delete());
		}else {
			System.out.println("File doesn't exits");
		}
	}

}
