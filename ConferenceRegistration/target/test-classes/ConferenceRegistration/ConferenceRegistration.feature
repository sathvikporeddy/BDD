#Author: Vamshidhar
Feature: Conference Registration form
Description: This feature file is to write scenarios for the conference registration form

Scenario: Opening the webpage and verifying the title of the web page
Given user is on the conference registration form
Then check the title of the web page

Scenario: Verifying the first name field
Given user is on the conference registration form
When user leaves the first name field as blank
Then alert message should be displayed

Scenario: Verifying the last name field
Given user is on the conference registration form
When user enters all the previous data and leaves the last name field as blank
Then alert message should be displayed

Scenario: Verifying the Email fiels for invalid format
Given user is on the conference registration form
When user enters all the previous data and enters the email format in wrong format then
Then alert message should be displayed

Scenario: Verifying the contact field
Given user is on the conference registration form
When user enters all the previous data and leaves the contact field as blank
Then alert message should be displayed

Scenario: Verifying contact field for invalid mobile number format
Given user is on the conference registration form
When user enters all the previous data
But enters invalid mobile number format
|6894561230|
|0789456123|
|98945612300|
|45612300|
|9894561230|
Then alert message should be displayed

Scenario: Verifying the number of people field
Given user is on the conference registration form
When user enters all the previous data and leaves the select people field blank
Then alert message should be displayed

Scenario: Verifying the building name and room number field as empty
Given user is on the conference registration form
When user enters all the previous data and leaves building name and room number field as blank
Then alert message should be displayed

Scenario: Verifying area name field
Given user is on the conference registration form
When user enters all the previous data and leaves area name field as blank
Then alert message should be displayed

Scenario: Verifying select city field
Given user is on the conference registration form
When user enters all the previous data and leaves the select city list as blank
Then alert message should be displayed

Scenario: Verifying select state field
Given user is on the conference registration form
When user enters all the previous data and leaves the select state list as blank
Then alert message should be displayed

Scenario: Verifying select membership field
Given user is on the conference registration form
When user enters all the previous data and leaves the membership option unselected
Then alert message should be displayed

Scenario: Validating the entered data
Given user is on the conference registration form
When user enters all the data and clicks next
Then alert message should be displayed

Scenario: Accepting the validated data alert message and navigating the next page
Given user is on the conference registration form
When user click OK on the alert box
Then navigate to the next page and verify whether the correct page has been loaded