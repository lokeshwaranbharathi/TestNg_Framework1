package com.testng.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon_TestNG {
	public static WebDriver driver;

	@BeforeSuite
	private void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\TestNG_Framework\\Driver\\chromedriver.exe");

	}

	@BeforeTest
	private void browserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.get("http://www.amazon.in/");
	}
	
	/*@BeforeClass
	private void logIn(){
		
		//WebElement account = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		//a.moveToElement(account).perform();
		
		WebElement acc = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
		a.moveToElement(acc).perform();
		
		WebElement signindiv = driver.findElement(By.id("nav-signin-tooltip"));
		a.moveToElement(signindiv).perform();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebElement signIn = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
        a.moveToElement(signIn).perform();
	    a.click(signIn).perform();
        driver.findElement(By.name("email")).sendKeys("+919092734498");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("B3a5b9a2");
        driver.findElement(By.id("signInSubmit")).click();
	}
	*/
	
	@BeforeClass
	 private void logIn() throws Throwable {
		driver.findElement(By.id("twotabsearchtextbox")).click();
		Thread.sleep(3000);
		WebElement sign = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
        Actions a = new Actions(driver);
        a.moveToElement(sign).perform();
        Thread.sleep(3000);
        WebElement sigIn = driver.findElement(By.xpath("(//a[@class='nav-action-button'])[1]"));
        a.click(sigIn).perform();
        driver.findElement(By.name("email")).sendKeys("+919092734498");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("B3a5b9a2");
        driver.findElement(By.id("signInSubmit")).click();
        
	}
	
	@BeforeMethod
	private void refresh() {
		driver.navigate().refresh();

	}
	
	@Test
	private void mobileSearch() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@Test
	 private void earPhone() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus bullets wireless z");
        driver.findElement(By.id("nav-search-submit-button")).click();
	}
	@AfterMethod
	private void mainPage() {
	  driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']")).click();

	}
	@AfterClass
	private void logOut() {
		WebElement account = driver.findElement(By.id("nav-link-accountList"));
		Actions a = new Actions(driver);
		a.moveToElement(account).perform();
		WebElement signout = driver.findElement(By.xpath("//span[text()='Sign Out']"));
        a.click(signout).perform();
	}
	@AfterTest
	private void closeBrowser() {
		driver.close();

	}
	
}
