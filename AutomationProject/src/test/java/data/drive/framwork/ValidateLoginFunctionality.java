package data.drive.framwork;

import java.io.IOException;

import org.testng.annotations.Test;

public class ValidateLoginFunctionality extends DriverInstance {
	
	
	@Test
	public void loginFunctionality() throws IOException {
		
		LoginPage login=new LoginPage(driver);
		
		login.userName();
		login.userPassword();
		login.clickSignIn();
		
	}
	

	
	

}
