Feature: We are testing web application 

Scenario: Positive testing for login

Given Navigate to login page

When Enter email id "manjanagowda.linganagowdra@moolya.com"
And Enter the Password "Manju@123"
And Click on login button

Then Verify home page displayed or not "HOME"
