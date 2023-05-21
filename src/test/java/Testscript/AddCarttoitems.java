package Testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import initialization.Baseclass;
import pages.addtocart;
@Listeners(generic.CustomListener.class)

public class AddCarttoitems extends Baseclass{
	@Test
	private void addcart() {
		addtocart ac=PageFactory.initElements(driver, addtocart.class);
		ac.additemstocart();
		// TODO Auto-generated method stub

	}

}
