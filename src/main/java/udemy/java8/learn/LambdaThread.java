package udemy.java8.learn;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LambdaThread {
	
	public static Integer callableDemo(String str) throws InterruptedException, ExecutionException{
		ExecutorService pool = Executors.newFixedThreadPool(3);
		Callable<Integer> myCallable = () ->{
			return Integer.valueOf(str.length());
		};
		return pool.submit(myCallable).get();
	}

	private Callable<Integer> Integer() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable myRunnable = ()->{
			int i = 0;
			while(i<5) {
				System.out.println("Thread printing "+i);
				i++;
			}
		};
		Thread t1 = new Thread(myRunnable);
		t1.start();
		String str = "hello world****";
		System.out.println(callableDemo(str));
		
	}

}
