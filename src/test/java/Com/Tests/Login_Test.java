package Com.Tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.pom.Login_Page;

public class Login_Test extends Base {
Login_Page login;
	
	@BeforeMethod
	public void SetUp() throws IOException 
	{
		LaunchTheWeb();
	
		
	}
	
	@AfterMethod
	public void tearDown()
	
	{
		driver.quit();
	}
	
	@Test
	public void loginTest()
	{
		login= new Login_Page();
		login.setUsername(login.getUsername());
		login.setPassword(login.getPassword());
		login.ClickOnLoginButton();
		
		
		
	}



	}


