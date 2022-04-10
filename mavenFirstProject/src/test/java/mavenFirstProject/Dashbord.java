package mavenFirstProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashbord {
@Test
public void verify_loginPageCorrect(){
	System.out.println("Dashboard_Page....");
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///A:/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
driver.findElement(By.xpath("/html/body/div/div[2]/form/div[3]/div/button")).click();
String actTitle=driver.getTitle();
driver.close();
Assert.assertEquals(actTitle, "JavaByKiran | Dashboard");
}
}
