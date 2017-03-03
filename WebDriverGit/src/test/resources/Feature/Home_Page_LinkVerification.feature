
Feature: Home_Page_LinkVerification

@Home_Page_CarsLinkVerification			
Scenario: Home_Page_CarsLinkVerification
Given Home page has cars link
When Cars Link is clicked	
Then Verify if we land on cars page 
And Exit the browser

@Home_Page_HotelsLinkVerification
Scenario: Home_Page_HotelsLinkVerification
Given Home page has cars link
When Hotels Link is clicked	
Then Verify if we land on Hotels page 
And Exit the browser
