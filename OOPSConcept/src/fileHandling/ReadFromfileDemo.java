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
		}catch(Exception e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
