package com.generic.library;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazonpagefactory.AmazonPF;

public class GenericClass {

	WebDriver driver;
	AmazonPF pf;

	public void GenericClass(WebDriver driver) {

		this.driver = driver;

	}

	public void getSetUp() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		pf = PageFactory.initElements(driver, AmazonPF.class);
		driver.get(pf.getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	public void signIn() throws InterruptedException {

		pf.getSignInLink().click();
		pf.getUserNameBox().sendKeys(pf.getUserName());
		pf.getUserPassBox().sendKeys(pf.getUserPass());
		pf.getClickSinInButton().click();
		// pf.getSearchBox().sendKeys(pf.getSearchItem());

	}

	public void tearDown() throws InterruptedException {
		Actions ac = new Actions(driver);
		
		WebElement accele = driver.findElement(By.xpath("(//*[@id='nav-link-accountList']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		 ac.moveToElement(accele).moveToElement(driver.findElement(By.xpath("(//*[contains(text(),'SignOut')])[1]"))).build().perform();
		
		// driver.close();

	}

}
