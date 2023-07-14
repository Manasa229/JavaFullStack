package oops;

public class Car {
	
	/*If no constructor, the java includes default constructor
	 * Java says Either you do it or I will do 
	 * If I have defined constructor, then I must provide the required paramets
	 * 
	 */
	
	/* constructor is a method
	 * whose name is same as class, but doesnot return anything else we initialize
	 * the properties
	 */
	
	public Car() {
		speed= 0;
		engine="off";
	}
	
    //Dynamic default values/setter values
	//you can see method overloading
	public Car(int speed,String engine) {
		this.speed= speed;
		this.engine=engine;
	}

	private String engine;
	private int speed;
	
	
	public void setSpeed(int speed) {
		this.speed = speed;
		
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	
	public String run() {
		return "The car is ruuning at "+this.speed +"km/hr";
	}


}
