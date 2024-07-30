package cratecontact;

import org.testng.annotations.Test;

public class orgTest {
@Test
public void loginTest()
{
	
	String URL= System.getProperty("url");
	String Browser= System.getProperty("browser");		
	String UserName= System.getProperty("username");		
	String Password= System.getProperty("password");		
	System.out.println(URL);
	System.out.println(Browser);
	System.out.println(UserName);
	System.out.println(Password);
	
	
	System.out.println("hii");
}
@Test
public void logoutTest()
{
	System.out.println("hii");
}
}
