package com.sets.main;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

// Application to see intersection and difference between two TreeSets, accessing the elements, 
// removing and adding elements to TreeSet
public class Main {
	
	public static void main(String str []) {
		
		// The first group og elements
		Set <String> itemsSet = new TreeSet<>();
		
		itemsSet.add("Linden");
		itemsSet.add("Eiche");
		itemsSet.add("Kiefer");
		itemsSet.add("Ahorn");
		itemsSet.add("Jasmin");
		
		// The second group og elements
		Set <String> itemsSet1 = new TreeSet<>();
		
		itemsSet1.add("Linden");
		itemsSet1.add("Eiche");
		itemsSet1.add("Kiefer");
		itemsSet1.add("Mandarin");
		itemsSet1.add("Ahorn");
		itemsSet1.add("Orange");
		itemsSet1.add("Jasmin");
		
		
		// Sets with items represented
		System.out.println("The first set of items:" + itemsSet);
		System.out.println("The second set of items:" + itemsSet1);
		
		// Tree Kiefer is going to be removed from the first set
		itemsSet.remove("Kiefer");
		
		// The first set with items represented after removing Kiefer
		System.out.println("The first set of items:" + itemsSet);
		
		//Showing index of TreeSet element Linden and Jasmin from itemsSet
		//For this we need to add each element to ArrayList in loop by iterating itemsSet
		ArrayList<String> list = new ArrayList<>();
		for (String element : itemsSet1) {
			list.add(element);
		}
		
		System.out.println(list.indexOf("Linden")); // index 4, because TreeSet sorts elements in alphabetic order
		System.out.println(list.indexOf("Jasmin")); // index 2
		
		// Difference - elements that are not the same in two sets
		Set <String> difference = new TreeSet<>(itemsSet1);// Creating set difference with elements of itemsSet1
		difference.removeAll(itemsSet); // Removing all same elements having in itemsSet
		
		//Showing difference between itemsSet and itemsSet1
		System.out.println("Difference between two sets" + difference);
		
		// Intersection - common elements between itemsSet and itemsSet1
		Set <String> intersection = new TreeSet<>(itemsSet);// Creating set intersection with elements of itemsSet
		intersection.retainAll(itemsSet1); // Set with the same elements between itemSet and itemSet1
		
		//Showing intersection between itemsSet and itemsSet1
		System.out.println("Intersection between two sets" + intersection);
		
		
		
	}
	
	

}
