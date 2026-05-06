package com.wip.java8;

interface Calculate {

	// public int add(int a, int b);
	public void add(int a, int b);
	
	public default void display() {
		System.out.println("From display...");
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		Calculate c = (a, b) -> System.out.println(a + b);
		c.add(44, 10);

		Calculate c1 = (a, b) -> System.out.println(a - b);
		c1.add(44, 10);
		
		c.display();
	}
}

//public class LambdaDemo implements Calculate {
//
//	public static void main(String[] args) {
//		LambdaDemo ld = new LambdaDemo();
//		System.out.println(ld.add(10, 12));
//		
//		
//	}
//
//	@Override
//	public int add(int a, int b) {
//
//		return a + b;
//	}
//
//}