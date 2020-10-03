Feature: Login functionality Valid and Invalid  Credentials

Scenario Outline: Login with valid credentials
Given user is on home page
When  go to login page
And  enter username "<rowIndex>" and password "<rowIndex>"
And  click login button  
Then moves to login success page 
And  user logout of the application
Examples: 
|  rowIndex |   
|     1     | 


Scenario Outline: Login with invalid credentials
Given user is on home page
When  go to login page
And  enter username "<rowIndex>" and password "<rowIndex>"
And  click login button  
Then user see login failure message  
Examples: 
|  rowIndex | 
|  2        |     
|  3        |