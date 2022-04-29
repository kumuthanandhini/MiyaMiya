package com.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmBookingRoomByPayment {
	public static WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement first_name ;
	
	@FindBy(id="last_name")
	private WebElement last_name ;
	
	@FindBy(id="address")
	private WebElement bill_address ;
	
	@FindBy(id="cc_num")
	private WebElement credit_card_no;
	
	public ConfirmBookingRoomByPayment(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCvv_no() {
		return cvv_no;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	@FindBy(id="cc_type")
	private WebElement credit_card_type;

	@FindBy(id="cc_exp_month")
	private WebElement exp_month ;
	
	@FindBy(id="cc_exp_year")
	private WebElement exp_year ;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv_no ;
	
	@FindBy(id="book_now")
	private WebElement book_now ;

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getBill_address() {
		return bill_address;
	}

	public WebElement getCredit_card_no() {
		return credit_card_no;
	}

	public WebElement getCredit_card_type() {
		return credit_card_type;
	}

	public WebElement getExp_month() {
		return exp_month;
	}

	public WebElement getExp_year() {
		return exp_year;
	}

	
	
}
