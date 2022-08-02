package arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class arraylists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// array list can also contain duplicates
			List<Integer>myArray=new ArrayList<Integer>();	
			myArray.add(8);
			myArray.add(9);
			myArray.add(10);
			myArray.add(11);
			myArray.add(12);
		
		//System.out.println(myArray);
		
		    for(int i=0; i<=50; i++)
			myArray.add(i);
			System.out.println(myArray.toString());
			//prints out the list elements one by one
			for (int i = 0; i < myArray.size(); i++) {
				System.out.println(myArray.get(i)+"");
			}
		//works on a queue data structure can contain duplicates
		 	
		List<String>linkedArray=new LinkedList<String>();	
		linkedArray.add("a");
		linkedArray.add("b");
		linkedArray.add("c");
		//add at a specified location in the list
		linkedArray.add(2, "f");
		
		
		
	
	 //cant not contain duplicates doesnt work on index basis
	  
		Set<Integer>hashSet=new HashSet<Integer>();
		hashSet.add(5);
		hashSet.add(6);
		System.out.println(hashSet);
		//printing all items one by one
		for(Integer i:hashSet)
			System.out.println(i);
		
	// cant contain duplicates and naturally sorts the elements
		
	Set<String>treeSet=new TreeSet<String>();
	treeSet.add("brian");
	treeSet.add("crane");
	treeSet.add("allan");
	
	System.out.println(treeSet);
	treeSet.add("dan");
	System.out.println(treeSet);
		
		//tree map will sort according to the natural order of the keys
		Map<Integer, String>myMap=new TreeMap<Integer, String>();
		myMap.put(1, "science");
		myMap.put(0, "math");
		System.out.println(myMap);
		System.out.println(myMap.size());
		System.out.println(myMap.containsKey(2));
		for(Integer key: myMap.keySet()) {
			System.out.println("key: " +key+", "+ "value: "+myMap.get(key));
		}
	
		
		//enhanced for loop
		int []keys= {1,2,3,6};
		for(int ind:keys) {
			System.out.println(ind);
		}
		
		
		//stack is essentials a LIFO list meaning Last In First Out 
		Stack<String>countries=new Stack<String>();
		countries.push("uganda");
		countries.push("kenya");
		countries.push("tz");
		System.out.println(countries);
		String popped=countries.pop();
		System.out.println("the poped item is "+popped);
		System.out.println(countries);
		for(String elements:countries) {
			System.out.println(elements);
		}
		
		
	}

}
