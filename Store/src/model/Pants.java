package model;

public class Pants extends Product{
	
	protected PantsType type;

	

	public Pants(String name, double price, Size size, String color, PantsType type) {
		super(name, price, size, color);
		this.type = type;
	}

	public PantsType getType() {
		return type;
	}

	public void setType(PantsType type) {
		this.type = type;
	}

}
