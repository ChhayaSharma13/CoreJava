package Basics;

public class StringConcat {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String concatenation follows BODMAS approach
		// + operator is ltr operator
		String s1 = "Hello there";
		String s2 = "World";
		String s3 = "Java";
		System.out.println(s1+10);
		System.out.println(10+20+s1);
		System.out.println(s1+10+20);
		System.out.println(s1+10*20);
		
		System.out.println(String.join(": ", s1, s2));
		System.out.println(String.join(" ", s1, s2, s3));
		System.out.println(s1.concat(s2.concat(s3)));
		System.out.println(s1.subSequence(0, 8));
		System.out.println(s1.substring(3,10)+ s2 +5);
	}
}
