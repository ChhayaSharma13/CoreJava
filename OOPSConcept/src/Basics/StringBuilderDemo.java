package Basics;

public class StringBuilderDemo {

	public static void main(String[] args) {
//		As methods in StringBuffer class are synchronized, so performance was an issue, to overcome this StringBuilder
//		concept was introduced in java1.5 to create mutable objects
		
		StringBuffer sb = new StringBuffer();
		StringBuilder sb1 =  new StringBuilder();
		System.out.println(sb1.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append("Hello World"));
		System.out.println(sb.length());
		System.out.println(sb.capacity());

//		Difference between String, StringBuffer, StringBuilder
//		 			String			StringBuffer	StringBuilder
//		Storage		Heap ar,SCP		Heap Area		Heap Area
//		Objects		Immutable		mutable			mutable
//		To use		when data isn't frequently changing data
//					changing frequently
	}

}
