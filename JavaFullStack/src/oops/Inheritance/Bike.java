package oops.Inheritance;

public class Bike extends Vehicle{
	public String handle;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String engine, int fuelTank) {
		super(engine, fuelTank);
		this.handle="short";
	}
	
	public String getHandle() {
		return this.handle;
	}

	
	@Override
	public String toString() {
		return "Bike";
	}

}
