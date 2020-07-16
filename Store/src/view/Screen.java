package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.LoginController;



public class Screen extends JFrame {

	private JPanel contentPane;
	protected static LoginController Supervisor=new LoginController();
	/**
	 * Launch the application.
	 */
	private static Screen present=new Screen();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DialogCreator(1);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void Swap(int type)
	{	
		present.setVisible(false);
		DialogCreator(type);
	}
	//type=1 weed
	public static void DialogCreator(int type) //Can use enum too.
	{
		//0 Screen(This, father)(Error)
		//type=1 Login screen
		//2 Register
		//3 HomePage
		//4 JeansePage
		//5 ShirtsPage
		//6 Stock
		//7 UserDetails
		if(type==1)
		{
			present=new Login();
			present.setSize(522,327);
		}
		else if(type==2)
		{
			present= new CreateNewUser();
			present.setSize(480,480);
		}
		else if(type==3)
		{
			present=new HomePage();
			present.setSize(520,400);
		}
		else if(type==4)
		{
			present=new JeansePage();
			present.setSize(530,380);
		}
		else if(type==5)
		{
			present=new ShirtsPage();
			present.setSize(530,380);
		}
		else if(type==6)
		{
			present=new Stock();
			present.setSize(680,505);
		}
		else if(type==7)
		{
			present=new UserDetails();
			present.setSize(690,510);
		}
		else if(type==8)
		{
			present=new DressPage();
			present.setSize(530,380);
		}
		else if(type==9)
		{
			present=new ShortsPage();
			present.setSize(530,380);
		}
		else if(type==10)
		{
			present=new CartPage();
			present.setSize(690,690);
		}
		else if(type==0) //This
		{
			present=new Screen();
			present.setSize(690,690);
			//If reached this page >>> Error.
			//"Display error"
		}

		present.setVisible(true);
	}
	
}