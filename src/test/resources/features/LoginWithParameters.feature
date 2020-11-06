
Feature:  Login as different users

  Scenario: login as a driver user
    Given the user is on the login page
    When the user logs in using "user10" and "UserUser123"
    Then the user should be able to login
    And the title contains "Dashboard"



#homework
#@wip
  Scenario: login as a usertype
    Given the user logged in as "store_manager"
    When the user should be able to login
    Then the title contains "Dashboard"
    #Logged in as driver, sale_smanager, store_manager
  #you will have one step definition and it will handle different usertype


