package test;
import controller.LoginController;
import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

public class Junit extends LoginController {
		
	@Test
	public void testDiscountGet() {
		Junit test = new Junit();
		int disc = (int) test.getdisc();
		assertEquals(1, disc);
	}
	
	
	@Test
	public void TestGetProductid() throws SQLException {
		Junit test = new Junit();
		int id= test.getproductid("dress", "mini", "white", "medium");
		assertEquals(17,id);
	}
	
	@Test
	public void ConfirmCartStartsEmpty()
	{
		Junit test = new Junit();
		boolean isempty= test.getcart().equals("");
		assertEquals(true,isempty);
	}
	
	@Test
	public void TestLogin() throws SQLException
	{
		Junit test = new Junit();
		boolean result = test.login("lior", "1234");
		//good login
		assertEquals(true,result);
		
		//Bad login(wrong password)
		result = test.login("lior", "12345");
		assertEquals(false,result);
		
		//Bad login(NO SPECIAL CHARS IN USERNAME OR password)
		result = test.login("lior!", "1234");
		assertEquals(false,result);
	}
	
	@Test
	public void TestRegisterProtection() throws SQLException {
		Junit test = new Junit();
		String result = test.RegisterPretest("lior", "Yada", true, false);
		//User exists
		assertEquals("User exists allready",result);
		
		//Test allowed char 
		result = test.RegisterPretest("!!!!", "Yada", false, true);
		assertEquals("Only chars and number in Password and name!",result);
		
		//GOOD INPUT!
		result = test.RegisterPretest("FakeUser420", "shouldbegood", false, true);
		assertEquals("GOOD",result);
		
	}
	
	@Test
	public void PureStringCheck(){
		Junit test = new Junit();
		boolean tester =test.ConfirmLegitText("GoodText123");
		assertEquals(true,tester);
		tester =test.ConfirmLegitText("29423$%");
		assertEquals(false,tester);
	}
	
	@Test
	public void ConfirmCorrectProductPrice() throws SQLException {
		Junit test = new Junit();
		double price = test.Pricer("dress", "mini", "white", "medium");
		String toCheck = String.valueOf(price);
		assertEquals("199.99",toCheck);
	}
	
	
}
