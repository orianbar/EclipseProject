package model;

import java.util.ArrayList;

public class Warehouse {
	
	//Warehouse manger implemented at "Database" model, deprecated function
	ArrayList<Product> products=new ArrayList<Product>();

	public ArrayList<Product> getAllProducts(){
		return products;
	}

	public void removeProduct(Product product)
	{	
		int length=products.size();
		for (int i = 0; i < length; i++) {
			if(product==products.get(i))			
				products.remove(i);		
		}
	}
	
	public void addProducts(ArrayList<Product> products)
	{
		for (int i = 0; i < products.size(); i++) 
			this.products.add(products.get(i));
		
	}
	
	public String getAllProductsToString()
	{
		String result="";
		for (int i = 0; i <  products.size(); i++) 
			result+=products.get(i).toString()+"\n";
		
		return result;
	}
	
}
