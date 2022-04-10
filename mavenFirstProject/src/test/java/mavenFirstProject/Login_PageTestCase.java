package mavenFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login_PageTestCase {

	WebDriver driver=null;
	
	@Test(priority=1)
	public void checklogicPageHeading(){
		System.out.println("Heading......");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///A:/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		String txtHeading=driver.findElement(By.xpath("/html/body/div/div[1]/a/b")).getText();
		driver.close();
	    Assert.assertEquals(txtHeading, "Java By Kiran");		
}
	@Test(priority=2)
	public void checkSubHeading(){
		System.out.println("subHeading.....");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///A:/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		String txtsubHeading=driver.findElement(By.xpath("/html/body/div/div[1]/a/h4")).getText();
		driver.close();
		Assert.assertEquals(txtsubHeading, "JAVA | SELENIUM | PYTHON");		
	}
}
