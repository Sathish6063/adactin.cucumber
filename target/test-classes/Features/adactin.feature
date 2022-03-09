Feature: ADACTIN HOTEL

  @tag1
  Scenario: Login into the webpage3 https://adactinhotelapp.com
    Given user launches browser and opens webpage
    When user enters valid username and password
    Then clicks login

  Scenario: user trying to search for hotel
    Given user selects desired location
    And hotel
    And room type
    And number of rooms
    And check in date
    And check out date
    And adults per room
    And user clicks search
    And user select the hotel
    Then user clicks continue

  @tag3
  Scenario: user trying to book hotel
    Given user inputs name
    When user inputs adress
    And card number
    And card type
    And card expire month
    And card expire year
    And enter cvv
    Then clicks Book now

  @tag4
  Scenario: user trying to cancel booking
    Given user clicks on booked itenary
    When user clicks the booked they want to cancel
    Then clicks cancel selected
    And user clicks ok and cancels the book
