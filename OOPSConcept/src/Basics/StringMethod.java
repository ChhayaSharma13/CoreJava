package Basics;
public class StringMethod {
	public static void main(String args[]) {
		String name = "  Chhaya Sharma  ";
		String email = "abc@gmail.com";
		String pass = "abc12";
		if(name.trim().isEmpty()) {
			System.out.println("String is empty");
		}
		else {
			System.out.println("Name :" +name.trim());
		}
	}
}
