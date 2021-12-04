package udemy.java8.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
/**
 * 1.List preserves insertion order and allows duplicates
 * 2. Set -->HashSet -->Treeset no duplicates are allowed.
 * @author puneet
 *
 */
public class LambdaColl {

	public static void creatingList() {
		List<String> strList = new ArrayList<>();
		strList.add("Sunny");strList.add("Bunny");strList.add("Chinny");strList.add("Sunny");
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println("Collections.sort(strList) =>"+strList);
		Collections.sort(strList,(s1,s2)->s2.compareTo(s1)); 
		System.out.println(strList);
	}
	
	public static void creatingSet() {
		Set<String> strSet = new HashSet();
		strSet.add("Sunny");strSet.add("Bunny");strSet.add("Chinny");strSet.add("Sunny");
		System.out.println(strSet);
		Collection<String> coll =strSet.stream().collect(Collectors.toCollection(TreeSet::new));
		System.out.println("Ascending order::"+coll);
	}
	//not duplicates, no insertion order is maintained.
	public static void creatingMap() {
		Map<String,String> m= new HashMap<>();
		m.put("A","Apple");m.put("Z","Apple");m.put("Puneet","Java");m.put("B","Boy");m.put("T","Tiger");
		System.out.println(m);
		
	}
	public static void main(String[] args) {
		creatingList();
		creatingSet();
		creatingMap();

	}

}
