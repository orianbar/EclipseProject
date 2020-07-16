package model;

import javax.swing.*;
import java.sql.*;


public class Database {
	Connection cont=null;
	
	static Database db=null;
	private Database()
	{
		//Singelton, singel ton. does what ever singleton does. Can it be multiple? Not it can't it's a single...lookout it is a single tooooon 
	}
	public Database getinstance()
	{
		if(db==null)
			db=new Database();
		return db;
	}
	
	
	public static Connection Sqlighter(){
		//Connection connection = DriverManager.getConnection("jdbc:postgrsql://127.0.0.1:5432/STOREDB", "postgres", "12345");
		// SUPER IMPORTANT NOTE! "pgadmin 4 dba tool" == very bad.
		
		//SQLite connection...
		try {
			Class.forName("org.sqlite.JDBC");
			Connection cont = DriverManager.getConnection("jdbc:sqlite:C:\\db\\storDb.sqlite"); //Please place db folder in C.
			return cont;
			
		}catch(Exception e)
		{
			JOptionPane.showInternalMessageDialog(null, e);
			return null;
		}
		
	}

}
