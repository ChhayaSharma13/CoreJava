package Basics;

public class StringConcat {
	public static void main(String[] args) {
		//String concatenation follows BODMAS approach
		// + operator is ltr operator
		String s1 = "Chhaya";
		System.out.println(s1+10);
		System.out.println(10+20+s1);
		System.out.println(s1+10+20);
		System.out.println(s1+10*20);
	}
}
