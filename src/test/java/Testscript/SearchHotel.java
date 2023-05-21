package Testscript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import initialization.Baseclass;
import pages.searchrestorantadd;
@Listeners(generic.CustomListener.class)

public class SearchHotel extends Baseclass{
	
	@Test
	private void Restorentsearch() {
		searchrestorantadd sr=PageFactory.initElements(driver, searchrestorantadd.class);
	sr.hotelsearch();
		// TODO Auto-generated method stub

	}

}
