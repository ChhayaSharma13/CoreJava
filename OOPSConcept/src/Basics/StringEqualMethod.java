package Basics;
public class StringEqualMethod {
	public static void main(String[] args) {
		String s1 = new String("Chhaya");
		String s2 = new String("Chhaya");
		String s3 = "Chhaya";
		
//		== operator checks for reference while equals method check for value
		System.out.println(s1 == s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}
}
