Feature: To validate the login functionality of facebook
Background:
   # Given User should open the browser and launch url(due to hooks)
    @sanity
Scenario Outline: To validate invalid username and invalid password

When User should type invalid "<username>" and invalid "<password>"
And user have to get current url 
And User click login button
Then Validate user should navigate to incorrect credential page

 Examples:
     |username|password|
     |dhruv@123|2345|
     |Shankar@123|456|

  @smoke @regression
Scenario: To validate valid username and invalid password

When User should type valid Username and invalid password
#lD list without header
   |apple|apple@123|mango|mango@123|grapes|grapes@456|cherry|cherry@456|

And user have to get current url 
And User click login button
Then Validate user should navigate to incorrect credential page
@regression
Scenario: To validate valid username and valid password

When User should type valid Username and valid password
#2D list without header
    |apple|apple@123|mango|mango@123|grapes|grapes@456|cherry|cherry@456|
    |jasmine|jasmine@123|rose|rose@456|lilly|lilly@56|lotus|lotus@68|


And user have to get current url 
And User click login button
Then Validate user should navigate to incorrect credential page

