package pages;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ch.qos.logback.core.joran.action.Action;
import initialization.Baseclass;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;

public class searchrestorantadd extends Baseclass{
	
	@FindBy(id = "com.application.zomato:id/search_edit_text")
	private static WebElement searchtextfield;
	
	@FindBy(id = "com.application.zomato:id/edittext")
	private static WebElement textfield;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.TextView[1]")
	private static WebElement Title;
	
	
	public void hotelsearch() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
		wait.until(ExpectedConditions.visibilityOf(searchtextfield));
		searchtextfield.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		textfield.sendKeys("Meghana Foods");
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		
		TouchAction touchAction = new TouchAction(driver);
		touchAction.tap(new PointOption().withCoordinates(369, 524)).perform();
		
		wait.until(ExpectedConditions.visibilityOf(Title));
			String PageTital=Title.getText();  
			assertEquals(PageTital, "Meghana Foods");
			String HotelName=PageTital;
			System.out.println("Hotel Name is" +HotelName );
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	}
	

	
	

}
