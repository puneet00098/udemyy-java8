package udemy.java8.learn;

public class LamdaLearn {



	public static void main(String[] args) {
		System.out.println("hi");
		FunctInterface fi  = new Demo();
		fi.display();
		fi = ()->System.out.println("Lambda Expressions.");
		fi.display();
		AddInterface ai = (a,b)->System.out.println("sum is: "+(a+b));
		ai.add(10, 32);
		StrLength sL = (str) -> str.length();
		System.out.println(sL.getLength("puneet"));
		StrLength sl = (str)->{
			String str1 = str.trim();
			System.out.println(str);
			System.out.println(str1);
			return str1.length();
		};
		System.out.println(sl.getLength("    Pun ee t  "));
		SquareIt si = (a)->a*a;
		System.out.println(si.square(20));
		
	}

}
@FunctionalInterface
interface FunctInterface{
	public void display();
	default void m1() {
	}
}
/**
 * FunctInterface01 is child functional interface.
 * it can over-ride but no other abstract methods are allowed. 
 * @author puneet
 *
 */
@FunctionalInterface
interface FunctInterface01 extends FunctInterface{
	public void display();
	default void m1() {
	}
}
class Demo implements FunctInterface{
	
	public void display() {
		System.out.println("normal implementation");
	}
}

@FunctionalInterface
interface AddInterface{
	public void add(int a, int b);
}

@FunctionalInterface
interface StrLength{
	public int getLength(String str);
}
@FunctionalInterface
interface SquareIt{
	public int square(int i);
}