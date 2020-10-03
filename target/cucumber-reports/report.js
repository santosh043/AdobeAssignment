$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/functionalTests/EndToEndTests.feature");
formatter.feature({
  "name": "Automated EndtoEnd Tests",
  "description": "Description: The purpose of this feature is to test End to End integration.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Customer Book Flights for Round Trip an order by search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "logon with valid user name \"\u003cusername\u003e\" and valid password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "moves to login success page",
  "keyword": "And "
});
formatter.step({
  "name": "go to Flight Booking page",
  "keyword": "And "
});
formatter.step({
  "name": "he search for Round Trip booking",
  "keyword": "And "
});
formatter.step({
  "name": "moves to Flight details page",
  "keyword": "And "
});
formatter.step({
  "name": "choose departure flight and return flight",
  "keyword": "And "
});
formatter.step({
  "name": "moves to Traveller details page",
  "keyword": "And "
});
formatter.step({
  "name": "enters travellers details",
  "keyword": "And "
});
formatter.step({
  "name": "moves to AddOns page",
  "keyword": "And "
});
formatter.step({
  "name": "select addons",
  "keyword": "And "
});
formatter.step({
  "name": "moves to Seat assignments page",
  "keyword": "And "
});
formatter.step({
  "name": "select seat assignments",
  "keyword": "And "
});
formatter.step({
  "name": "moves to payment details page",
  "keyword": "And "
});
formatter.step({
  "name": "enter payments details",
  "keyword": "And "
});
formatter.step({
  "name": "moves to order success page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "",
        "password"
      ]
    },
    {
      "cells": [
        "santosh2006043@gmail.com",
        "",
        "Qwer$123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Customer Book Flights for Round Trip an order by search",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "logon with valid user name \"santosh2006043@gmail.com\" and valid password \"Qwer$123\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.logon_with_valid_user_name_and_valid_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "moves to login success page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.moves_to_loginsuccess_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "go to Flight Booking page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.go_to_Flight_Booking_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "he search for Round Trip booking",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.he_search_for_Round_Trip_booking()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "moves to Flight details page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.moves_to_Flight_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "choose departure flight and return flight",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.choose_departure_flight_and_return_flight()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "moves to Traveller details page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.moves_to_Traveller_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "enters travellers details",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.enters_travellers_details()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "moves to AddOns page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.moves_to_AddOns_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "select addons",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.select_addons()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "moves to Seat assignments page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.moves_to_Seat_assignments_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "select seat assignments",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.select_seat_assignments()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "moves to payment details page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.moves_to_payment_details_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "enter payments details",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.enter_payments_details()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "moves to order success page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.EndToEndSteps.moves_to_order_success_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.uri("file:src/test/resources/functionalTests/Login.feature");
formatter.feature({
  "name": "Login functionality Valid and Invalid  Credentials",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "go to login page",
  "keyword": "When "
});
formatter.step({
  "name": "enter username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "name": "moves to login success page",
  "keyword": "Then "
});
formatter.step({
  "name": "user logout of the application",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "santosh2006043@gmail.com",
        "Qwer$123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "go to login page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.go_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "enter username \"santosh2006043@gmail.com\" and password \"Qwer$123\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.logon_with_valid_username_and_valid_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "moves to login success page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.moves_to_loginsuccess_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user logout of the application",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_logout_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "go to login page",
  "keyword": "When "
});
formatter.step({
  "name": "enter username \"\u003cusername\u003e\" and password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "name": "user see login failure message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "santosh2006043@gmail.com",
        "Qwer$123456"
      ]
    },
    {
      "cells": [
        "santosh2006043@gmail.com",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "go to login page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.go_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "enter username \"santosh2006043@gmail.com\" and password \"Qwer$123456\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.logon_with_valid_username_and_valid_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user see login failure message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_see_login_failure_message()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "go to login page",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.go_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "enter username \"santosh2006043@gmail.com\" and password \"12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.logon_with_valid_username_and_valid_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user see login failure message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.LoginSteps.user_see_login_failure_message()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepDefinitions.LoginSteps.user_see_login_failure_message(LoginSteps.java:80)\r\n\tat ✽.user see login failure message(file:///D:/AdobeAssignmentNew/Automation/src/test/resources/functionalTests/Login.feature:20)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "");
formatter.afterstep({
  "status": "passed"
});
});