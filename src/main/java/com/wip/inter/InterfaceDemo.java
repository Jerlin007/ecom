package com.wip.inter;

interface Trans{
	
	public void move();
}

interface Vehicle {

	String fuel = "Petrol";

	abstract void stop();

}
class ABC{}
class Bus extends ABC implements Vehicle,Trans {

	@Override
	public void stop() {
		System.out.println("Bus Stopped..");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		//Trans t = new Trans();
		Vehicle ve = new Bus();
		
		ve.stop();

	}

}
