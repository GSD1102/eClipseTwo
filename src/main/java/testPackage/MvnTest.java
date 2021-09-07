package testPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MvnTest {

	public String baseUrl = "https://www.javatpoint.com/";  
	String driverPath = "C:\\Users\\Kash\\Desktop\\Java\\chrome\\chromedriver.exe";  
	public WebDriver driver ; 
	
	@Test             
	public void test() 
	{      
	
	System.setProperty("webdriver.chrome.driver", driverPath);  
 
	driver = new ChromeDriver();  
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	driver.manage().window().maximize();  
	driver.get(baseUrl);  
	// get the current URL of the page  
	String URL= driver.getCurrentUrl();  
	System.out.print(URL);  
	//get the title of the page  
	String title = driver.getTitle();                  
	System.out.println(title);  
	}     
	
	@BeforeTest
	public void beforeTest()
	{    
	System.out.println("before suyin  test");  
	}     
	
	
	@AfterTest
	public void afterTest() {  
	driver.quit();  
	System.out.println("after test");  
	}
	
	
	}  
	
	

