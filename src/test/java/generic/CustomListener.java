
  package generic;
  
  import java.io.File; import java.io.IOException;
  
  import org.apache.commons.io.FileUtils; import
  org.openqa.selenium.OutputType; import org.openqa.selenium.TakesScreenshot;
  import org.testng.ITestContext; import org.testng.ITestListener; import
  org.testng.ITestResult;
  
  
  import initialization.Baseclass;
  
  public class CustomListener extends Baseclass implements ITestListener {
  public void onTestStart(ITestResult iTestResult) { } public void
  onTestSuccess(ITestResult iTestResult) {
  
  test = extent.createTest(iTestResult.getName(), " - PASSED"); }
  
  public void onTestFailure(ITestResult iTestResult) { test = extent.createTest(iTestResult.getName(), " - FAILED");
  
  TakesScreenshot ts =(TakesScreenshot) Baseclass.driver; 
  File srcFile=ts.getScreenshotAs(OutputType.FILE);
  
  try { String filePath =System.getProperty("user.dir")+"\\Screenshots\\" + iTestResult.getName() + ".jpeg";
  FileUtils.copyFile(srcFile, new File(filePath));
  test.addScreenCaptureFromPath(filePath); 
  } 
  catch (IOException e) 
  {
  e.printStackTrace();
  } 
  }
  public void onTestSkipped(ITestResult iTestResult) {
  test = extent.createTest(iTestResult.getName(), " - SKIPPED"); }
  
  public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
  
  }
  
  public void onStart(ITestContext iTestContext) {
  
  }
  
  public void onFinish(ITestContext iTestContext) { }
  
  
  
  
  
  
  
  
  
  
  
  }
 