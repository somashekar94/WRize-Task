package Testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import initialization.Baseclass;
import pages.ZomatoAPPlogin;
@Listeners(generic.CustomListener.class)

public class Loginintozomato extends Baseclass{
	@Test
	private void Loginpage() throws InterruptedException {
		ZomatoAPPlogin ln=PageFactory.initElements(driver, ZomatoAPPlogin.class);
				ln.Loginusinggmaill();
//				ln.LoginwithMnumber();
		// TODO Auto-generated method stub

	}

}
