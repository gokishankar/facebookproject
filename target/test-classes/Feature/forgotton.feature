
Feature: To validate the Forgotten password in facebook application
@smoke 
Scenario: To validate the Invalid email for forgotten password

#Given User have to launch the facebook application through chrome browser(due to hooks)

When User have to click the forgotten password

And User have to Enter invalid email
#1D map with header
     |fruits|apple|
     |flower|jasmine|
     |vegetables|carrot|

Then User have to click search button

@morning

Scenario: To validate the valid email for forgotten password

#Given User have to launch the facebook application through chrome browser(due to hooks)

When User have to click the forgotten password

And User have to Enter valid email
#2D map with header
     |name     |variety1|variety2|
     |fruits   |apple   |Mango   |
     |flower   |jasmine |lilly   |
     |vegetables|carrot |beetroot|

Then User have to click search button