package pages;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import initialization.Baseclass;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import net.bytebuddy.asm.MemberSubstitution.FieldValue;

public class addtocart extends Baseclass {

	@FindBy(xpath = "	//android.widget.FrameLayout[@content-desc=\"Paneer Biryani is a veg dish of ₹330\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	private static WebElement item1;
	// android.widget.FrameLayout[@content-desc="Paneer Biryani is a veg dish of
	// ₹330"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]
	// android.widget.FrameLayout[@content-desc=\"Chicken Boneless Biryani is a
	// non-veg dish of
	// ₹325\"]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]

	@FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Chicken 65 is a non-veg dish of ₹279\"]/android.widget.LinearLayout/android.widget.LinearLayout")
	private static WebElement item2;

	@FindBy(id = "com.application.zomato:id/button")
	private static WebElement addcartbtn;

	@FindBy(id = "com.application.zomato:id/item_count")
	private static WebElement itemcount;

	@FindBy(id = "com.application.zomato:id/search_bar")
	private static WebElement searchitemtxtbox;

	@FindBy(id = "com.application.zomato:id/edittext")
	private static WebElement edittextbox;

	@FindBy(id = "com.application.zomato:id/dish_stepper")
	private static WebElement lemonchicken;
	// Lemon Chicken

	@FindBy(id = "com.application.zomato:id/next_state")
	private static WebElement nextbtn;

	public void additemstocart() {
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
		  wait.until(ExpectedConditions.visibilityOf(item1)); item1.click();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		  System.out.println("Total Items in cart"+itemcount.getText());
		  wait.until(ExpectedConditions.visibilityOf(item2)); String itemname =
		  "Chicken 65"; driver.findElement(new AppiumBy.
		  ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0).scrollIntoView(new UiSelector().textContains(\""
		  +itemname+"\").instance(0))"));
		  wait.until(ExpectedConditions.visibilityOf(item2)); item2.click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		  addcartbtn.click(); wait.until(ExpectedConditions.visibilityOf(itemcount));
		  System.out.println("Totalitmes in cart"+itemcount.getText());
		  searchitemtxtbox.click();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		  edittextbox.sendKeys("Lemon Chicken"); ((AndroidDriver) driver).pressKey(new
		  KeyEvent(AndroidKey.ENTER));
		  wait.until(ExpectedConditions.visibilityOf(lemonchicken));
		  lemonchicken.click();
		  
		  nextbtn.click();
		 

	}

}
