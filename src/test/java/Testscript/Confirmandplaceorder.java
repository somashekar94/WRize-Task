package Testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import initialization.Baseclass;
import pages.addaddressandconfirm;

public class Confirmandplaceorder extends Baseclass{
	@Test
	private void placeorder() {
		addaddressandconfirm ac=PageFactory.initElements(driver, addaddressandconfirm.class);
		ac.locationandconfirm();
		
		// TODO Auto-generated method stub

	}

}
