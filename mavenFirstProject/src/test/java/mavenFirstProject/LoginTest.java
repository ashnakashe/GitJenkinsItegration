package mavenFirstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.loginpage.LoginPage;

public class LoginTest {

@Test
public void test01(){
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///A:/javabykiran-Selenium-Softwares/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
	
	LoginPage lp=new LoginPage(driver);
	lp.loginToApplication();
}
}
