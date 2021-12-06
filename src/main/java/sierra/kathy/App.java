package sierra.kathy;

import java.math.BigInteger;

class A{
	protected  BigInteger sum(Integer a, int b) {
		return BigInteger.valueOf(a+b);
	}
}
class B extends A{
	
	protected  BigInteger sum(Integer a, int b) {
		return BigInteger.valueOf(a+b);
	}
	public  String sum(String a, int b) {
		return String .valueOf(a+b);
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
