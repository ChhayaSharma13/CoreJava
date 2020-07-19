package Basics;

public class StringUpdate {

	public static void main(String[] args) {
		String s1 = "This is String Update Example";
		System.out.println(s1.replace("is", "was"));
		System.out.println(s1.replaceFirst("is", "was"));
		System.out.println(s1.replaceAll("is(.)", "was"));
		System.out.println(s1.replaceAll("is(.*)", "was"));

	}

}
