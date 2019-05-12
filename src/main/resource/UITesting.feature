Feature: Search testing on google.com
Scenario: Verify the search operarion on google

Given Google Url "https://www.google.com"
When I search "apple" to the page
Then It should show search result page