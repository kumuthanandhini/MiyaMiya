package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.pom.ConfirmBookingRoomByPayment;
import com.pom.LoginApplication;
import com.pom.SearchTheHotel;
import com.pom.SelectTheHotel;

public class PageObjectManager {
public static WebDriver driver;
	
 public PageObjectManager(WebDriver driver2) {
	 this.driver=driver2;
 }
 
 
	public static LoginApplication getLoginPage() {
	LoginApplication la = new LoginApplication(driver);
	return la;
	}
	
	public static SearchTheHotel getSearchTheHotel() {
	SearchTheHotel  searchhot = new SearchTheHotel(driver);
	return searchhot;
}
	
	public static SelectTheHotel getSelectTheHotel() {
	SelectTheHotel selecthot = new SelectTheHotel(driver);
	return selecthot;
	}
	
	public static ConfirmBookingRoomByPayment getConfirmBookingByPayment() {
	ConfirmBookingRoomByPayment payment = new ConfirmBookingRoomByPayment(driver);
	return payment;
	}

	
	


}
