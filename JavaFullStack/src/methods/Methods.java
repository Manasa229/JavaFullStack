package methods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method1(8);
		System.out.println(area(5,7));

	}
	
	public static void method1(int a) {
		System.out.println(a);
		
	}
	
	
	public static void method2() {
		
	}
	
	
	
	/*Method overloading
	 *Method name can be same but signature(parameters has to be different)
	 * 
	 */
	
	public static double area(double length,double width) {
		return length *width;	
	}
	
	public static double area(double side) {
		return side*side;	
	}
	

}

/*pice of code that perform some tasks and may/maynot return the value
 * helps in reusable
 */
 
