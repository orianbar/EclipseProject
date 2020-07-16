package model;

public class Shorts extends Pants{
	
	private int length;



	public Shorts(String name, double price, Size size, String color, PantsType type, int length) {
		super(name, price, size, color, type);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	

}
