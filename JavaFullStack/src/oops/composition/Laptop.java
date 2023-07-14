package oops.composition;

public class Laptop {

	private String screen;
	
	/* Composition : one class refere to one or mpre objecrs of other class
	 * 
	 */
	private Processor proocessor;
	private GraphicsCard graphicsCard;
	
	public Laptop(){
		this.screen = "16.7";
		this.proocessor=new Processor();
		this.graphicsCard= new GraphicsCard();
	}
	
	public Laptop(String screen,Processor p,GraphicsCard g){
		this.screen = "16.7";
		this.proocessor=p;
		this.graphicsCard= g;
	}
	
	public String toString() {
		return "Laptop";
	}
	
	
	public Processor getProcessor() {
		return this.proocessor;
	}
	
}
