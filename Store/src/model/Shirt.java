package model;

public class Shirt extends Product{
	
	private boolean sleeves;


	public Shirt(String name, double price, Size size, String color, boolean sleeves) {
		super(name, price, size, color);
		this.sleeves = sleeves;
	}

	public boolean isSleeves() {
		return sleeves;
	}

	public void setSleeves(boolean sleeves) {
		this.sleeves = sleeves;
	};

}
