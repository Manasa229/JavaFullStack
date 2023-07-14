package oops.Polymorphism;

public class Phone {
	private String model;
	
	public Phone(String model) {
		this.model = model;
	}
	
	public void features() {
		System.out.println(this.model+" phone");
	}
	public String getModel() {
		return model;
	}

}
