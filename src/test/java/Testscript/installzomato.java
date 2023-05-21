package Testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import initialization.Baseclass;
import pages.playstore;

@Listeners(generic.CustomListener.class)

public class installzomato extends Baseclass {
@Test
public void appintall() throws Exception {
	playstore ap=PageFactory.initElements(driver, playstore.class);
	ap.Installapp();
}
}
