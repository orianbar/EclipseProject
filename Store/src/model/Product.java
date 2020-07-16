package model;

public class Product {

	protected String name;
	protected double price;
	protected Size size;
	protected String color;



	public Product(String name, double price, Size size, String color) {
		this.name = name;
		this.price = price;
		this.size = size;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Size getSize() {
		return size;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", size=" + size + "]";
	}

	public void setSize(Size size) {
		this.size = size;
	}


}
