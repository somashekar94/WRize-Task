package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import initialization.Baseclass;

public class addaddressandconfirm extends Baseclass{

	
	@FindBy(xpath = "//android.widget.Button[@content-desc=\"Your current location is Delivery at **Work **. Change your delivery location.")
	private static WebElement changelocationbtn;
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout[3]/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[2]")
	private static WebElement selectaddress;
	
	@FindBy(id = "com.application.zomato:id/crossButton")
	private static WebElement closeaddressbar;
	
	@FindBy(id = "com.application.zomato:id/place_order_text")
	private static WebElement placeorder;
	
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Your order total is ₹421.75. Proceed to place order\"]/android.widget.TextView[1]")
	private static WebElement totalamount;
	
public void locationandconfirm() {
	
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4000));
	  wait.until(ExpectedConditions.visibilityOf(changelocationbtn));
	  changelocationbtn.click();
	  wait.until(ExpectedConditions.visibilityOf(selectaddress));
	  selectaddress.click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	  placeorder.click();
	 

	
}
}
