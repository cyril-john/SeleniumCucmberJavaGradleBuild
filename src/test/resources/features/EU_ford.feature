Feature: Ford check features

  Scenario: user navigates to ford UK site and performs some action
    Given navigate to ford UK site
    Then accepts FORD UK cookies
    And for mustang machE click on View Stock
    Then close window
    And this change added that needs to be pulled when working on new branch DEV 
