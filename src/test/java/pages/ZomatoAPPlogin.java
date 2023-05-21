package pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import initialization.Baseclass;

public class ZomatoAPPlogin extends Baseclass{
	
	@FindBy(id = "com.application.zomato:id/fw_mobile_edit_text")
	private static WebElement MobileNumber;
	
	@FindBy(id = "com.application.zomato:id/send_otp_button")
	private static WebElement continuewbtn;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.LinearLayout[1]")
	private static WebElement googlesign;
	
	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]")
	private static WebElement selectemailid;
	
	@FindBy(id = "com.application.zomato:id/tv_login_or_signup")
	private static WebElement loginpage;
	
	@FindBy(id = "com.application.zomato:id/resendButton")
	private static WebElement Resendbtn;
	
	@FindBy(id = "com.application.zomato:id/tv_toast_message")
	private static WebElement incorrectotpmsg;
	
	
	@FindBy(id = "com.application.zomato:id/location_title")
	private static WebElement title;
	
	public void Loginusinggmaill() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.visibilityOf(googlesign));
		googlesign.click();
		wait.until(ExpectedConditions.visibilityOf(selectemailid));
		selectemailid.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));

		/*
		 * wait.until(ExpectedConditions.visibilityOf(title)); if (title.isDisplayed())
		 * { System.out.println("Login successfull");
		 * 
		 * }
		 * 
		 * else { System.out.println("Loginfailed"); }
		 */
		
	}
	
	
	
	
	public void LoginwithMnumber() throws InterruptedException {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));
wait.until(ExpectedConditions.visibilityOf(MobileNumber));
MobileNumber.click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
MobileNumber.sendKeys("9620777334");
continuewbtn.click();


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));

if(incorrectotpmsg.isDisplayed())
{
	System.out.println(incorrectotpmsg.getText());
}
else {
	Thread.sleep(1000);
	System.out.println("Loginsuccessfull");
}

				
	}



}
