package generic;

import java.util.concurrent.TimeUnit;

//import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest implements IAutoConstant {

	public static WebDriver driver;
	
	static{
		
		System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	
	
	@BeforeMethod
	public void openApplication(){
		
		driver= new ChromeDriver();
		
		 String url = Lib.getProperty(CONFIG_PATH, "URL"); 
		 
		 driver.get(url);
		 String ITO = Lib.getProperty(CONFIG_PATH, "ImplicitTimeOut"); 
		 
		 int timeoutPeriod = Integer.parseInt(ITO);
		 driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS);
	}
	
	
	
	@AfterMethod
	
	public void closeApplication() throws Throwable{
		
		Thread.sleep(3000);
		
		driver.close();
	}
	
	
	}
