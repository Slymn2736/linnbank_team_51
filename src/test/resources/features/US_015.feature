@US015
Feature:US015_System should allow user to manage their account
    Given user enters linnbank home page
  Scenario: System should allow to user
    Then user enters linnbank home page
    Then user clicks on human icon
    Then user enters sign in button
    Then user enters a valid customer username "hakki10"
    Then user enters a valid password "Hakki10."
    Then user clicks on sign in button
    Then user clicks on my operations button
    Then user clicks on my accounts
    Then user should see customer accounts

