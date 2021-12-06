package oreilly.java8.pocket.book.reftype;
/**
 * The != and == equality operators are used to compare the memory locations of two objects. 
 * If the memory addresses of the objects being compared are the same,
 * the objects are considered equal.
 * 
 * @author puneet
 */
public class EqualityOperators {
	
	public void comparingObj() {
		Guest guest1 = new Guest("wilson");
		Guest guest2 = guest1;
		Guest guest3 = new Guest("name");
		Guest guest4 = new Guest("name");
		if(guest2 == guest1) {
			System.out.println("they are equal.");
			System.out.println("guest1.."+guest1.getName() +"... guest2..." +guest2.getName());
		}
		if(guest3 == guest4) {
			System.out.println("equal");
		}else {
			System.out.println("not equal");
		}
	}
	
}
class Guest {

	private String name;
	//private Integer age;
	public Guest(String name/* , Integer age */) {
		super();
		this.name = name;
		//this.age = age;
	}
	public String getName() {
		return name;
	}
}