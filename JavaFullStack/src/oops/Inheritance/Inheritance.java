package oops.Inheritance;

public class Inheritance {
	
	/*
	 * child IS-A parent
	 * 
	 * 
	 * Eg:Bike,Car,Truck
	 * has common engine,wheels etc
	 * 
	 * So we can bring this common propertis to the parent
	 * so that we can inherit in the child, so that code redundancy is avoided.
	 * 
	 * It uses extends
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike bike = new Bike("off",5);
		System.out.println(bike.getHandle());
		System.out.println(bike);
		
		Car car = new Car();
		car.engine="on";
		car.run();
		
		

	}

}


/*
 * Single inheritence , class A ---> class B
 * 
 * Mutiple Inheritance, can be inherited from multiple classes. Not supported 
 * in Java. If multiple class has same properties then it can break
 * 
 * Multilevel Inheritance , class A----> class B---->class C(different levels)
 * 
 * Heirarical Inheritance, one class can be inherited in different classes which we did
 * 
 * Hybrid Inheritance: Combination of above(no multiple inheritance)
 * 
 */




