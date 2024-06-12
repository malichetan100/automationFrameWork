package com.methods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.logger.Log4j;
import com.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseTest {
	
	static Logger log = LogManager.getLogger(BaseTest.class);
	public static WebDriver wd;
	public static Properties prop;
	static DateFormat FD=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	public static ExtentTest test;
	static Date systemDate=new Date();
	static String datofSystem= FD.format(systemDate).toString().replace(":", "").replace(" ", "");
	
	protected static ExtentReports extent=new ExtentReports();
	ExtentSparkReporter spark= new ExtentSparkReporter("C:\\Users\\HP\\Desktop\\JALA\\JALA_Selenium_Framework\\target\\"+datofSystem+".html");
	
	public BaseTest()
	{
		log.info("The config.prperty file executing");
		try {
			prop=new Properties();
			FileInputStream ip=new FileInputStream("C:\\Users\\HP\\Desktop\\JALA\\JALA_Selenium_Framework\\src\\main"
					+ "\\java\\com\\config\\config.properties");
			prop.load(ip);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@BeforeTest
	public void extentreportstart()
	{
		extent.attachReporter(spark);
	}
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public static void launchbrowser()
	{
		log.info("Launching browser");
		//String browserName=prop.getProperty("browser");
		String browserName="Chrome";
		
			if(browserName.equals("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 wd= new ChromeDriver();		
		} 
		
				if(browserName.equals("FireFox")) {
		log.info("Launching FireFox browser");
		WebDriverManager.firefoxdriver().setup();
		wd=new FirefoxDriver();		
		} 
	
			if(browserName.equals("Edge")) {
		log.info("Launching Edge browser");
		WebDriverManager.edgedriver().setup();
		wd=new EdgeDriver();		
		} 
		System.out.println(wd);
		wd.manage().window().maximize();
		wd.manage().deleteAllCookies();
		wd.manage().timeouts().pageLoadTimeout(TestUtil.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
		wd.manage().timeouts().implicitlyWait(TestUtil.IMPLICICT_WAIT, TimeUnit.SECONDS);
		
		wd.get(prop.getProperty("url"));
		
		//wd.get("https://magnus.jalatechnologies.com/");		
			
	}
	
	@AfterMethod
	public static void closeBrowser(ITestResult result)throws Exception
	{
		//ExtentTest test= extent.createTest("Login_And_Logout");
		if(result.getStatus()==ITestResult.FAILURE)
		test.log(Status.FAIL, "TestCase is failed" +result.getName());
		test.log(Status.FAIL, "TestCase is failed" +result.getThrowable());
		
		String sspath=captureScreenshot();
		test.log(Status.FAIL, (Markup) test.addScreenCaptureFromPath(sspath));
		log.info("Clossing Browser");
		wd.close();
		wd.quit();
	}
	
	@AfterTest
	public static void closeBrowser1()
	{
		log.info("Clossing Browser");
		extent.flush();
		wd.quit();
	}
	
	
	public static String captureScreenshot()
	{
		TakesScreenshot takeScreenshot=(TakesScreenshot)wd;
	    File src=takeScreenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File("./targer/ScreenShot/"+datofSystem+".jpg");
		try {
			FileUtils.copyFile(src, dest);
		}catch(IOException e){
			 e.printStackTrace();
		}
		return dest.getAbsolutePath();
	}
}

