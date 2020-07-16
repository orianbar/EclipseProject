package controller;

import java.awt.*;
import javax.swing.*;

import model.Database;

import java.sql.*;

public class LoginController {
	
	static String usernames;
	double Discount=1; 
	static Connection cont=null;
	String cart=""; // CUT BY -, also cut different items by #
	static int IC=0; //count on cart
	
	public void addtocart(int id,int count,double price)
	{
		//Combining matching lines isn't implanted because it is black work and not course related
		cart = cart.concat(String.valueOf(id));
		cart = cart.concat("-");
		cart = cart.concat(String.valueOf(count));
		cart = cart.concat("-");
		cart = cart.concat(String.valueOf(price));
		cart = cart.concat("#");
	}
	
	public double getdisc()
	{
		return Discount;
	}
	
	public int getproductid(String type,String subtype,String color,String size) throws SQLException
	{
		initialazie();
		String IDsql="";
		if(type=="dress")
		{
			IDsql="SELECT productId FROM Products as p where p.name='"+type+"' and color='"+color+"' and size='"+size+"';";
		}
		Statement stt  = cont.createStatement();
		ResultSet Res = stt.executeQuery(IDsql);
		if(Res.next()==false)
			return 100;
		int ret=Res.getInt("productId");
		return ret;
	}
	
	public String getcart()
	{
		return cart;
	}
	
	public boolean login(String username,String password) throws SQLException
	{

		if(!(ConfirmLegitText(username)&&ConfirmLegitText(password)))
		{
			return false;
		}
		//...
		initialazie();
		String qur="SELECT Name, Password FROM Users as Person WHERE Person.Name='"+username+"' and Person.Password='"+password+"'";
        Statement stt  = cont.createStatement();
        ResultSet Res    = stt.executeQuery(qur);
        
		if(Res.next()) //Login query
		{
			usernames=username;
			
			//Discount make
			qur="SELECT Member,Worker FROM Users as u where u.name='lior'";
			stt = cont.createStatement();
			Res = stt.executeQuery(qur);
			if(Res.getBoolean("Member"))
			{
				Discount=0.9;
			}
			if(Res.getBoolean("Worker"));
			{
				Discount=0.7;
			}
			
			
			return true;	
		}
		else
		{
			return false;
		}
	
	}
	public String RegisterPretest(String username,String password,boolean member,boolean worker) throws SQLException
	{
		//Reg tests
		if(!ConfirmLegitText(username)||!ConfirmLegitText(password))
		{
			return "Only chars and number in Password and name!";
		}
		initialazie();
		//User test
        Statement stt  = cont.createStatement();
        
        
		String NoUserQr="SELECT Name FROM Users as Person WHERE Person.Name='"+username+"'";
		ResultSet Res = stt.executeQuery(NoUserQr);
		if(Res.next()) //Login query
		{
			return "User exists allready";	
		}
		return "GOOD";
	}
	public String Register(String username,String password,boolean member,boolean worker) throws SQLException
	{
		if(cont!=null)
			cont.abort(null);
		initialazie();
		String Regs="INSERT INTO Users(Name, Password, Member, Worker, CreditCard) VALUES('"+username+"', '"+password+"', "+member+", "+worker+", NULL);";
		cont.prepareStatement(Regs).execute();		
		return "Registration Successful";	
	}
	public double Pricer(String type,String subtype,String color,String size) throws SQLException
	{
		if(cont!=null)
			cont.abort(null);
		initialazie();
		String PriceSql="";
		if(type=="dress")
		{
			PriceSql="SELECT price FROM Products as p where p.name='"+type+"' and color='"+color+"' and size='"+size+"';";
		}
		Statement stt  = cont.createStatement();
		ResultSet Res = stt.executeQuery(PriceSql);
		if(Res.next()==false)
			return 100;
		double ret=Res.getDouble("price");
		return ret;
	}
	
	private void initialazie() {
		cont=Database.Sqlighter();
	}
	
	protected boolean ConfirmLegitText(String test)
	{
	      char[] charArray = test.toLowerCase().toCharArray();
	      for (int i = 0; i < charArray.length; i++) {
	         char ch = charArray[i];
	         if (!(ch >= 'a' && ch <= 'z')&&!(ch >= '0' && ch <='9')) {
	            return false;
	         }
	      }
		return true;
	}
	
}
