package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileDemo {
	public static void main(String[] args) {
		try {
			FileWriter fWrite = new FileWriter("file1.txt");
			fWrite.write("Files in Java is fun topic to practice and use.\n Now, I am appending this String to  see if it is going to write or do changes");
			fWrite.close();
			System.out.println("Successfully wrote to File!");
		}catch(IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
		}
	}
}
