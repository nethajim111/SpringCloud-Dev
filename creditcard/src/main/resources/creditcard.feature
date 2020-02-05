Feature: Credit Card CRUD Operation
  Scenario: client makes call to GET credit card details
    Given Get URI
    When the client calls 
    Then the client receives status code of 200
    And the client receives credit card details
