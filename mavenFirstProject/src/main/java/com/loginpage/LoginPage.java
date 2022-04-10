package com.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver lpdriver;
	// all webdriver and its methods
	
	public LoginPage(WebDriver driver){
		this.lpdriver=driver;
	}
	public WebElement getUname(){
		return lpdriver.findElement(By.id("email"));
		
	}
	public WebElement getPassword(){
		return lpdriver.findElement(By.id("password"));
		
	}
	public WebElement getLoginButton(){
		return lpdriver.findElement(By.xpath("//button"));
		
	}
	public void loginToApplication(){
		getUname().sendKeys("kiran@gmail.com");
		getPassword().sendKeys("123456");
		getLoginButton().click();
	}


}

