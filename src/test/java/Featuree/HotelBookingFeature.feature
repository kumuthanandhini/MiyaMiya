Feature: Booking Rooms Using Adactin

Scenario: User Login TO The Application
Given user_Launches_The_Applicaton
When user_Enter_The_Username_In_UserName_Field
And user_Enter_The_Password_In_Password_Field
Then user_Clicks_The_Login_Button_And_User_Navigate_To_Home_Page 
 
Scenario: User Search The Hotel
When user_Select_Location_From_Dropdownlist
And user_Select_Hotel
And user_Select_Roomtype
And user_Select_Number_Of_Rooms
And user_Select_Check_In_Date
And user_Select_Check_Out_Date
And  user_Select_Adults_Per_Room
And  user_Select_Children_Per_Room
Then user_Clicks_Search_Button_And_User_Navigate_To_Select_Hotel_Page

Scenario: User Select The Hotel
When user_select_The_Hotel_Using_Radio_Button
And user_Clicks_Continue_Button
Then user_Navigate_To_Payment_page

Scenario: User Confirm Booking Room By Payment 
When  user_Enter_The_First_Name_in_First_Name_Field
And user_Enter_The_Last_Name_in_Last_Name_Field
And user_Enter_The_Billing_Address
And user_Enter_Credit_Card_No
And user_Select_Credit_Card_Type
And user_Select_Month_From_Expire_Date
And user_Select_Year_From_Expire_Date
And user_Enter_Cvv_Number
Then user_Clicks_Book_Hotel_Button_And_Navigate_to_Booking_Confirmation_Page





