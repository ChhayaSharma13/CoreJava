package Basics;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		StringBuffer s3 = sb.append("Hii");
		System.out.println(sb.capacity()); //16+ string length
		
		sb.append("Hello");
		System.out.println(sb.capacity());
		
		sb.append("Hello, Java world");
		System.out.println(sb.capacity());
		
		System.out.println(sb.length());
//		capacity : How much characters an object store
//		while length  gives no. of characters stored
		System.out.println(sb.delete(2, 5));
		System.out.println(sb);
		System.out.println(sb.equals(sb2));
		System.out.println(sb.equals(s3));
//		String buffer doesn't override equals() method of String class
		System.out.println(sb.indexOf("ll"));
		System.out.println(sb.insert(3, "replace"));
		System.out.println(sb.replace(2,8,"g"));
		
//		subString 
		System.out.println(sb.substring(8));
		sb.toString();
		
		System.out.println(sb2+ "Hello");
		
		sb.setLength(6);
		System.out.println(sb);
		
//		to delete unnecessary space use trim() method
		sb2.ensureCapacity(100);
		sb2.append("Hii");
		sb2.trimToSize();
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		
		
	
	}

}
