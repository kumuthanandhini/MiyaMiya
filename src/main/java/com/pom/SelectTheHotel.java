package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectTheHotel {
	public static WebDriver driver;
	
	@FindBy(id="continue")
	private WebElement continu_btn;
	
	@FindBy(id="radiobutton_0")
	private WebElement ratio_btn ;

	public SelectTheHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getContinu_btn() {
		return continu_btn;
	}

	public WebElement getRatio_btn() {
		return ratio_btn;
	}

	


}
