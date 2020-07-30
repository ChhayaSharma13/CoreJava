package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DeletefileDemo {

	public static void main(String[] args) {
		File f1 = new File("file2.txt");
//		creating file object
		try {
			if (f1.createNewFile()) {
				System.out.println("File created: " + f1.getName());
			}else {
				System.out.println("file Already exists");
			}
//			Writing to file  file2
			FileWriter fWrite =new FileWriter("file2.txt");
			fWrite.write("hello, I'm some string in file2");
			fWrite.close();
			System.out.println("Written successfully to File "+ f1.getName());
			
//			Reading from file
			Scanner sc = new Scanner(f1);
			while(sc.hasNextLine()) {
				String data = sc.nextLine();
				System.out.println(data);
			}
			sc.close();
//			Deleting the file object
			if(f1.delete()) {
				System.out.println("Deleted the file: "+f1.getName());
			}
			else {
				System.out.println("Failed to delete the file");
			}
		}catch(IOException e)
		{
			System.out.println("an error occured");
		}
		

	}

}
