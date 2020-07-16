package model;

public class Jeans extends Pants {
	
	private String length;

	

	public Jeans(String name, double price, Size size, String color, PantsType type, String length) {
		super(name, price, size, color, type);
		this.length = length;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

}
