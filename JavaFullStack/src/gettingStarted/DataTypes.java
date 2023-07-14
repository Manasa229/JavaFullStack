package gettingStarted;
import java.math.BigDecimal;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int max = 999999999999;
		long max = 888888888;
		float a = 5f/2f;
		
		System.out.println(a);
		
		double b = 0.5d/0.9d; //precision is more in double
		float c = 0.5f/0.9f;
		
		
		System.out.println(b);
		System.out.println(c);
		
		int marker = 100;
		double percentage = 0.46f * marker;
		System.out.println(percentage);
		
		
		boolean isAvailable=true; //0/1 cannot be given 
		System.out.println(isAvailable);
		
		char var1 = '\u00A7',var2='$';  //Java follows unicode
		System.out.println(var1);
		
		double x = 1.05; // 
		double y = 2.55;
		System.out.println(x+y); //output is not accurate. why?
		
		BigDecimal d1 = new BigDecimal(1.05);
		BigDecimal d2 = new BigDecimal(2.55);
		System.out.println(d1.add(d2)); //Output is still worse why?
		
		
		BigDecimal d3 = new BigDecimal("1.05"); // to disable the rounding , use string
		BigDecimal d4 = new BigDecimal("2.55");
		System.out.println(d3.add(d4));
		
		
		String s1 = "abc";
		System.out.println(s1+"nh");
		
		String s2 = new String("abc");// string is a immutable class
		System.out.println(s1+"nh");
		
		
		//type casting: converting one data type to another
		int y2 = 10;
		short x2 = (short)(y2);
		System.out.println(x2);
		
		
		//(a+b) square = a^2 +b^2 +2ab
		
		 int a1=5;
		 float b1=20.8f;
		 double value= a1*a1+b1*b1+2*a1*b1;
		 System.out.println(value);
		 int value2= (int)(a1*a1+b1*b1+2*a1*b1);
		 System.out.println(value2);
	
		
		
		 

	}

}
