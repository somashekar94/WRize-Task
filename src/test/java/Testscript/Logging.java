package Testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import initialization.Baseclass;
import pages.Login_page;


@Listeners(generic.CustomListener.class)

public class Logging extends Baseclass{
	@Test
	public void LOGGIN() throws InterruptedException {
	Login_page lp=PageFactory.initElements(driver,Login_page.class);
	lp.Loginpage();
	

}
}