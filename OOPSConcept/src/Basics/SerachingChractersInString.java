package Basics;

public class SerachingChractersInString {

	public static void main(String[] args) {
		String s1 = "Hello World";
		System.out.println(s1.lastIndexOf("l"));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.contains("el"));
		System.out.println(s1.contains("ro"));
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.endsWith("d"));

	}

}
