package com.wip.java8;

public class LamdaDemo {

	public static void main(String[] args) {
		// Java 8 -- way 1

		Runnable r = () -> {
			Task t = new Task();
			t.print();

		};
		Thread t1 = new Thread(r);
		t1.start();

		// Java 8 -- way 2 -- Lambda As a Parameter
		Thread t2 = new Thread(() -> {
			Task t = new Task();
			t.print();

		});
		t2.start();

		// Java 8 -- way 3
		new Thread(() -> {
			Task t = new Task();
			t.print();

		}).start();

		// Java 8 -- way 4
		new Thread(() -> {
			new Task().print();

		}).start();
		
		// Java 8 -- way 5 -- Method Reference
		new Thread(new Task()::print).start();
		

		// Way -1 -- Java 7
//		Task t = new Task();
//		t.print();

		// Way -2 -- Java 7
//		MyThread mt = new MyThread();
//		Thread t1 = new Thread(mt);
//		t1.start();

		// Way -3 -- Java 7
//		Runnable r = new Runnable() {
//
//			@Override
//			public void run() {
//				Task t = new Task();
//				t.print();
//
//			}
//		};
//		Thread t2 = new Thread(r);
//		t2.start();
	}

}