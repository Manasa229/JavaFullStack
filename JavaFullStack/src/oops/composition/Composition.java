package oops.composition;

public class Composition {
	
	public static void main(String args[]) {
		Laptop laptop = new Laptop();
		System.out.println(laptop.getProcessor());
		
		Processor p= new Processor("ventu");
		GraphicsCard g = new GraphicsCard(123);
		
		Laptop gamingLaptop = new Laptop("45.7",p,g);
		
		System.out.println(laptop);
	}

}
