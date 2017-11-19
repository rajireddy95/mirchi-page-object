Feature: As an user, I am able to search for specific content on the Mirchi website
	Scenario: search for content on the Mirchi website and validate that it shows the relevant content
		Given I open mirchi website
	    When I click on search button and enter text
	    Then I should links relevant to search text on the page
