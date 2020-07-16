package model;

public class Dress extends Product{

	private DressType dressType;
	

	public Dress(String name, double price, Size size, String color, DressType dressType) {
		super(name, price, size, color);
		this.dressType = dressType;
	}

	public DressType getDressType() {
		return dressType;
	}

	public void setDressType(DressType dressType) {
		this.dressType = dressType;
	}
}
