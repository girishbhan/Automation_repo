 Feature: SauceDemo login Feature
Description: This feature file will test the valid login functionality
Scenario: Login with valid username and password
 Given open browser
 When Enter the url "http://saucedemo.com"
 And Enter valid username
 And Enter valid password
 And Click on login button
 Then User should be able to login and see the homepage
 