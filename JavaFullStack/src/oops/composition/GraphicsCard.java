package oops.composition;

public class GraphicsCard {
	private int series;
	
	public GraphicsCard() {
		this.series=940;
	}
	
	
	public GraphicsCard(int series) {
		this.series=series;
	}
	
	@Override
	public String toString() {
		return "Graphics card"+this.series;
	}
}
