package com.amazonpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPF {
	
	private String url="https://www.amazon.com/";
    public String getUrl() {
		return url;
	}

	
    
	@FindBy(xpath="(//*[@class='nav-line-2'])[3]")
	private WebElement signInLink;
	public WebElement getSignInLink() {
		return signInLink;
	}
    
	@FindBy(xpath="//*[@id='ap_email']")
	private WebElement userNameBox;
	public WebElement getUserNameBox() {
		return userNameBox;
	}
    
    private String userName="mmrsd2k@gmail.com";
	public String getUserName() {
		return userName;
	}
	
	@FindBy(xpath="//*[@id='ap_password']")
	private WebElement userPassBox;
	public WebElement getUserPassBox() {
		return userPassBox;
	}

	private String userPass="test1234";
	public String getUserPass() {
		return userPass;
	}
	
	@FindBy(xpath="//*[@id='signInSubmit']")
	private WebElement clickSinInButton;
	public WebElement getClickSinInButton() {
		return clickSinInButton;
	}
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	public WebElement getSearchBox() {
		return searchBox;
	}
	
	private String searchItem="Books";
	public String getSearchItem() {
		return searchItem;
	}
	
	
}
