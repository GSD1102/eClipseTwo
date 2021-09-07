package TestOneMavenProject.SeleniumMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException
	
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Kash\\Desktop\\Java\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("9921016396");
        driver.findElement(By.id("pass")).sendKeys("7875181174");
        Thread.sleep(10000);
        driver.findElement(By.id("u_0_2")).click(); 
        Thread.sleep(7000);
        driver.close();
		
		
		
		
	}

}
