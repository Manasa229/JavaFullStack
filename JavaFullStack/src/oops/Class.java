package oops;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car(3,"on");
		
		System.out.println(car.run());
		
		
		car.setSpeed(10);
		System.out.println(car.getSpeed());
		System.out.println(car.run());
		
	}

}
