package oops.Inheritance;

public class Vehicle {
	
	public String engine;
	public int fuelTank;
	
	public Vehicle() {
		this.engine = "off";
		this.fuelTank = 12;
	}
	
	
	public Vehicle(String engine, int fuelTank) {
		this.engine = engine;
		this.fuelTank = fuelTank;
	}
	
	public void run() {
		System.out.println("Vehicle running");
		
	}
	
	

}
