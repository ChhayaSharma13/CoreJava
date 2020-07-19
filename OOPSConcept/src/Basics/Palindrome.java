package Basics;

public class Palindrome {
	public static void main(String[] args) {
		String  str = "mam";
		String revString = "";
		for(int i =  str.length()-1;i>=0;i--) {
			revString = revString + str.charAt(i);
		}
		System.out.println(revString);
		if(revString.equals(str)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String isn't palindrome");
		}
	}
}
