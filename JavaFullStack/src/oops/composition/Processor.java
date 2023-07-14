package oops.composition;

public class Processor {
	
	private String brand;
	
	public Processor() {
		this.brand = "Ventura";
	}
	
	
public Processor(String brand) {
	this.brand = brand;
		
	}

@Override
public String toString() {
	return "Process: "+this.brand;
}

}
