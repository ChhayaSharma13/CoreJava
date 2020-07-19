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
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		int a =10, b=20;
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		System.out.println(a+b);
		System.out.println(s1+s2);
		char[] c = name.toCharArray();
		System.out.println(c);
	}
}
