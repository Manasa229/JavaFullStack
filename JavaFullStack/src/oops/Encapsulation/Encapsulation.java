package oops.Encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Encapsulation hides and only shows required info
		 * dont give direct access to the outside world
		 * 
		 * rather give getters and setters/constructors
		 */
		
		Person person = new Person(30);
		//person.age = -10; 
		// not logical correct so we have to overcome somehow
		System.out.println(person.toSTring());
		
		person.setAge(-30);
		//person.age = -10; 
		// not logical correct so we have to overcome somehow
		System.out.println(person.toSTring());

	}

}
