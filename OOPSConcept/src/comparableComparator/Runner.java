package comparableComparator;

import java.util.ArrayList;
import java.util.List;

public class Runner {
//	java.util and java.awt package both define a type called List
//	util version is the collection interface that is commonly used
//	awt version is a class used for creating a dropdown list GUI element
	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("DELL", 8, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("Lenovo", 8, 700));
		
		
	}

}