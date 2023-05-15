
package initialization ;




import org.openqa.selenium.remote.DesiredCapabilities;




import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import java.io.File;
import java.net.MalformedURLException;
//import java.net.URL;
//import org.openqa.selenium.remote.CapabilityType;


public class Baseclass {
    
    public static String deviceName;
    public static String udid;
    public static String platformName;
    public static String platFormVersion;
    public static String appPackage;
    public static String appActivity;
    public static AndroidDriver driver;

    
    protected static ExtentTest test;
    protected static ExtentReports extent;

  

    public static String excelInput = System.getProperty("user.dir")+"\\Input\\Test data.xlsx";



    @BeforeSuite
    public  void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        
        capabilities.setCapability(MobileCapabilityType.UDID,"886533fb");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"soma");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Andriod");
//        capabilities.setCapability(MobileCapabilityType.APP,"IMCL LCO APP");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "menloseweight.loseweightappformen.weightlossformen");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,".activity.SplashActivity t651");
//        capabilities.setCapability("autoGrantPermissions", "true");
        capabilities.setCapability("autoAcceptAlerts", "true");
//     capabilities.setCapability("appiumVersion","v1.22.3");
//        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:9515/wd/hub"),capabilities);  //4723
        
//        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:9515/wd/hub"),capabilities); 

    }
    
@BeforeTest
public static void setUpReports() {
	ExtentSparkReporter htmlReporter;
    htmlReporter = new ExtentSparkReporter(new File(System.getProperty("user.dir") + "/test-output/AutomationReport.html"));
    extent = new ExtentReports();
    extent.attachReporter(htmlReporter);
    htmlReporter.config().setDocumentTitle("Extent Report Demo");
    htmlReporter.config().setReportName("Test Report");
    htmlReporter.config().setTheme(Theme.STANDARD);
    extent.flush();
}
@AfterMethod
public void getResult(ITestResult result) {
    if (result.getStatus() == ITestResult.FAILURE) {
        test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " FAILED ", ExtentColor.RED));
        test.fail(result.getThrowable());
    } else if (result.getStatus() == ITestResult.SUCCESS) {
        test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " PASSED ", ExtentColor.YELLOW));
    } else {
        test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " SKIPPED ", ExtentColor.ORANGE));
        test.skip(result.getThrowable());
       
    }
    
    
   
}
@AfterMethod
public void afterMethod() {
    extent.flush();
}

  

    }
