package com.StepDefinition;

import java.net.BindException;

import org.openqa.selenium.WebDriver;

import com.AdactinBaseClass.BaseClass;
import com.PageObjectManager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelBookingStepDefinition extends BaseClass {
	public static WebDriver driver = BaseClass.getBrowser("chrome");
	PageObjectManager pom = new PageObjectManager(driver);
	
	
	@Given("^user_Launches_The_Applicaton$")
	public void user_launches_the_applicaton() throws Throwable {
	 
	}

	@When("^user_Enter_The_Username_In_UserName_Field$")
	public void user_enter_the_username_in_username_field() throws Throwable {
	  
	}

	@When("^user_Enter_The_Password_In_Password_Field$")
	public void user_enter_the_password_in_password_field() throws Throwable {
	   
	}

	@Then("^user_Clicks_The_Login_Button_And_User_Navigate_To_Home_Page$")
	public void user_clicks_the_login_button_and_user_navigate_to_home_page() throws Throwable {
	   
	}

	@When("^user_Select_Location_From_Dropdownlist$")
	public void user_select_location_from_dropdownlist() throws Throwable {
	
	}

	@When("^user_Select_Hotel$")
	public void user_select_hotel() throws Throwable {

	}

	@When("^user_Select_Roomtype$")
	public void user_select_roomtype() throws Throwable {
	  
	}

	@When("^user_Select_Number_Of_Rooms$")
	public void user_select_number_of_rooms() throws Throwable {
	  
	}

	@When("^user_Select_Check_In_Date$")
	public void user_select_check_in_date() throws Throwable {

	}

	@When("^user_Select_Check_Out_Date$")
	public void user_select_check_out_date() throws Throwable {
	  
	}

	@When("^user_Select_Adults_Per_Room$")
	public void user_select_adults_per_room() throws Throwable {
	 
	}

	@When("^user_Select_Children_Per_Room$")
	public void user_select_children_per_room() throws Throwable {
	   
	}

	@Then("^user_Clicks_Search_Button_And_User_Navigate_To_Select_Hotel_Page$")
	public void user_clicks_search_button_and_user_navigate_to_select_hotel_page() throws Throwable {


	}

	@When("^user_select_The_Hotel_Using_Radio_Button$")
	public void user_select_the_hotel_using_radio_button() throws Throwable {


	}

	@When("^user_Clicks_Continue_Button$")
	public void user_clicks_continue_button() throws Throwable {

	}

	@Then("^user_Navigate_To_Payment_page$")
	public void user_navigate_to_payment_page() throws Throwable {
	   ;
	}

	@When("^user_Enter_The_First_Name_in_First_Name_Field$")
	public void user_enter_the_first_name_in_first_name_field() throws Throwable {

	}

	@When("^user_Enter_The_Last_Name_in_Last_Name_Field$")
	public void user_enter_the_last_name_in_last_name_field() throws Throwable {
	 
	}

	@When("^user_Enter_The_Billing_Address$")
	public void user_enter_the_billing_address() throws Throwable {
	  
	}

	@When("^user_Enter_Credit_Card_No$")
	public void user_enter_credit_card_no() throws Throwable {
	   
	}

	@When("^user_Select_Credit_Card_Type$")
	public void user_select_credit_card_type() throws Throwable {
	
	}

	@When("^user_Select_Month_From_Expire_Date$")
	public void user_select_month_from_expire_date() throws Throwable {
	
	}

	@When("^user_Select_Year_From_Expire_Date$")
	public void user_select_year_from_expire_date() throws Throwable {
	   
	}

	@When("^user_Enter_Cvv_Number$")
	public void user_enter_cvv_number() throws Throwable {
	    
	}

	@Then("^user_Clicks_Book_Hotel_Button_And_Navigate_to_Booking_Confirmation_Page$")
	public void user_clicks_book_hotel_button_and_navigate_to_booking_confirmation_page() throws Throwable {
	   
	}



}
