package comparableComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Runner {
//	java.util and java.awt package both define a type called List
//	util version is the collection interface that is commonly used
//	awt version is a class used for creating a dropdown list GUI element
	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("DELL", 16, 1000));
		laps.add(new Laptop("Apple", 12, 1200));
		laps.add(new Laptop("Lenovo", 8, 700));
		
//		Collection.sort(laps);
//		Collection  - Interface  - std. functionality of DS like List, Set and Queue
//		Collections - class - to sort and synchronize the collection elements
		
		
//		Comparable interface for sorting List
		Collections.sort(laps);
		
		for(Laptop l:laps) {
			System.out.println(l);
		}
	}

}
