package collectionJava;

import java.util.ArrayList;

public class ArrayListJava {
	
	public static void main(String[] args) {
		ArrayList<String> days = new ArrayList<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Wednesday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		System.out.println(days);
		System.out.println(days.get(0));
		System.out.println(days.get(7));
		days.remove(4);
		System.out.println(days);
		System.out.println(days.size());
		System.out.println(days.get(6));
		
//		Loop through an array
		for(int i=0; i<days.size();i++) {
			System.out.println("Day "+(i+1)+ " of week is " + days.get(i));
		}
	}
	

}
