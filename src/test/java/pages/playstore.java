package pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.record.PageBreakRecord.Break;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import initialization.Baseclass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class playstore extends Baseclass {

	@FindBy(xpath = "//android.view.View[@content-desc=\"Search Google Play\"]")
	private static WebElement Searchbutton;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.EditText")
	private static WebElement editsearchbutton;

	@FindBy(xpath = "com.application.zomato:id/tv_claim_text")
	private static WebElement loginpagetext;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Install\"]")
	private static WebElement Instalbutton;

	@FindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	private static WebElement locationaccess;

	@FindBy(xpath = "//android.view.View[@content-desc=\"Open\"]")
	private static WebElement openapp;

//	@FindBy(id = "android:id/button1")

	@SuppressWarnings("deprecation")
	public void Installapp() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
		wait.until(ExpectedConditions.visibilityOf(Searchbutton));
		Searchbutton.click();
		wait.until(ExpectedConditions.visibilityOf(editsearchbutton));
		editsearchbutton.sendKeys("Zomato");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  Instalbutton.click(); 
		  wait.until(ExpectedConditions.visibilityOf(openapp));
		  openapp.click();
		  if (locationaccess.isDisplayed())
		  { 
			  locationaccess.click();
//			  assertEquals(loginpagetext.getText(),"India's #1 Food Delivery and Dining App");
			  System.out.println("APP launched successfully");
		  		  
		  } else {
		  
		  System.out.println("APP not installed");
		  }
		 

	}

}
