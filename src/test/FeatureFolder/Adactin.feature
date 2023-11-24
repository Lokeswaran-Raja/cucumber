Feature: Book hotel in adactin
  Scenario: login
    Given launch URL
    When Enter username
    And Enter password
    Then After login it redirect to next page

    Scenario: To search Hotel
      When select location
      And select hotels
      And select room type
      And select no of rooms
      And fill checkin date
      And fill checkout date
      And select no of persons
      And select no of childrens
      Then click search to view results

      Scenario: check and continue
        When select radio button
        Then click search to view next page

        Scenario: Fill Payment Details
          When fill first name
          And fill last name
          And fill address
          And enter credit card no
          And enter card type
          And select expiry date month
          And select expiry date year
          And enter CVV no
          Then click book now button
