#Author: Vamshidhar
Feature: Payment details form
Description: This feature file is to write scenarios for the payment details form

Scenario: Loading the payment form
Given user is on the payment details form
Then verify the title of payment details form

Scenario: Verifying the cardHolder name
Given user is on the payment details form
When user leaves the card holder name field as blank
Then alert message should be displayed

Scenario: Verifying the debit card number
Given user is on the payment details form
When user enters all the previous data and leaves the debit card number as blank
Then alert message should be displayed

Scenario: Verifying the card expiration month
Given user is on the payment details form
When user enters all the previous data and leaves the card expiration month as blank
Then alert message should be displayed

Scenario: Verifying the card expiration year
Given user is on the payment details form
When user enters all the previous data and leaves the card expiration year as blank
Then alert message should be displayed

Scenario: Enters all valid data
Given user is on the payment details form
When user enters all valid and clicks make payment button
Then alert message should be displayed

