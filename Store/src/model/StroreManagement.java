package model;

import java.util.ArrayList;

public class StroreManagement {
	
	private Warehouse warehouse=new Warehouse();
	
	
	
	public void buy(Product product)
	{
		warehouse.removeProduct(product);
	}
	


	public void addProducts(ArrayList<Product> products)
	{
		warehouse.addProducts(products);
	}
	
	
	public String getAllProductsToString()
	{
		return warehouse.getAllProductsToString();
		
	}

}
