package com.ip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		   WebElement username = driver.findElement(By.id("email"));
		   username.sendKeys("pratapsahoo594@gmail.com");
		    WebElement password = driver.findElement(By.id("pass"));
		   
		    password.sendKeys("pratap007");
		    WebElement Login = driver.findElement(By.id("u_0_b"));
		    Login.click();
	}
}
