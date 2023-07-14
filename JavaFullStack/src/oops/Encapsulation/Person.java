package oops.Encapsulation;

public class Person {
	public String name;
	//public int age = 23;// not logical correct so we have to 
							//overcome somehow,so make it private and use
							//setter, getter(or constructors)
	private int age;
	
	
	public Person() {
		this.age = 25;
	}
	
	public Person(int age) {
		this.age = age;
	}
	
	public boolean setAge(int age) {
		if (age>=0 && age<=100){
			this.age=age;
			return true;
		}
		return false;
		
	}
	public String toSTring() {
		return this.name+","+age;
	}

}
