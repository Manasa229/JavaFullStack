package oops.Polymorphism;

public class Samsung extends Phone{

	
	/*
	 * Sqamsung  IS_A phone
	 * 
	 */
	
	
	public Samsung(String model) {
		super(model);

	}
	
	public void features() {
		System.out.println("samsung phone");
	}

}

/* 
 * one more class iphone extends phone
 * but dont define features but still you can see the the features of parent,
 * that is polymorphism.
 *
 * 
 */
