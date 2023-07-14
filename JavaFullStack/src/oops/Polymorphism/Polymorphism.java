package oops.Polymorphism;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Multiple forms of objects
		 * 
		 * Benefits: 
		 */
		
		Phone phone = new Phone("Nokia");
		phone.features();
		
		Samsung sam = new Samsung("Note 8");
		System.out.println(sam.getModel());
		sam.features();
		
		Phone note9 = new Samsung("Note 9");
		note9.features();
		

	}

}
