package fileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFromfileDemo {

	public static void main(String[] args) {
		try {
			File f = new File("file1.txt");
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
			if(f.exists()) {
				System.out.println("File name: "+f.getName());
				System.out.println("Absolute Path: "+f.getAbsolutePath());
				System.out.println("Writable: "+f.canWrite());
				System.out.println("Readable: "+f.canRead());
				System.out.println("File size in bytes" + f.length());
			}else {
				System.out.println("file doesn't exist");
			}
		}catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
