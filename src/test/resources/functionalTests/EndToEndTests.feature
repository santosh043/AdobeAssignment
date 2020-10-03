Feature: Automated EndtoEnd Tests 
Description: The purpose of this feature is to test End to End integration.

Scenario Outline: Customer Book Flights for Round Trip an order by search
Given user is on home page
When  logon with valid user name "<username>" and valid password "<password>"
And   moves to login success page
And   go to Flight Booking page
And   he search for Round Trip booking 
And   moves to Flight details page
And   choose departure flight and return flight
And   moves to Traveller details page
And   enters travellers details
And   moves to AddOns page
And   select addons 
And   moves to Seat assignments page
And   select seat assignments
And   moves to payment details page
And   enter payments details
Then  moves to order success page

Examples: 
|  username  |                          | password | 
|  santosh2006043@gmail.com          | | Qwer$123 | 