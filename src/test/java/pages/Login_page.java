package pages;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import initialization.Baseclass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Login_page  extends Baseclass{

	@FindBy(id ="menloseweight.loseweightappformen.weightlossformen:id/card_beginner")
//	private static WebElement chooseyourplan;
	private static WebElement chooseyourplan;

	@FindBy(id="menloseweight.loseweightappformen.weightlossformen:id/button_next")
	private static WebElement Nextbutton ;
	
	@FindBy(id="menloseweight.loseweightappformen.weightlossformen:id/value_picker")
	private static WebElement datepicker;
	
	

	@SuppressWarnings("deprecation")
	public void Loginpage() throws InterruptedException {
		chooseyourplan.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//		datepicker.click();
		Nextbutton.click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		Nextbutton.click();
	
		
	}
	
	
	
	


	
	

	
}
