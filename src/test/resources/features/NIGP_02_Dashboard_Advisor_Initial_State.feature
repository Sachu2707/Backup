Feature: Dashboard | Advisor | Initial State

@NIGP-02_SC01
  Scenario: 01 Advisor validates the Menu with the list of services under the dashboard(That are applicable for the logged in advisor user)
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
#    And   : user able to see the Menu with the list of services under the dashboard (That are applicable for the logged in advisor user)

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

  @NIGP-02_SC02
  Scenario: 02 Advisor validates the list of services under the Menu(That are applicable for the logged in advisor user)
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
#    And   : user able to see the Menu with the list of services under the dashboard (That are applicable for the logged in advisor user)
#    When  user clicks btn_Menu
    Then  user able to see home service under the menu
    And   user able to see Elevator service under the menu
    And   user able to view Tools & Resources  → News & Research

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|


  @NIGP-02_SC03
  Scenario: 03 Advisor validate Profile Settings and Logout as menu options under profile icon(On the top right under the dashboard)
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And   user able to see the Profile Settings and Logout as menu options under profile icon

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

    #Customer Name

  @NIGP-02_SC04
  Scenario: 04 Advisor validates customer name displayed in the dashboard
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And  user able to see the Hello Advisor Preferred Name displayed in the dashboard

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

    #Main Banner

  @NIGP-02_SC05
  Scenario: 05 Advisor validates Main Carousel field
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And  user able to see the Main Carousel with the Insights content based on the CMS category set for the Main Carousel

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

  @NIGP-02_SC06
  Scenario: 06 Advisor verify See More link in the dashboard
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And  user able to see the See More link on top of the Main Carousel in the dashboard

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

    #Research

  @NIGP-02_SC07
  Scenario: 07 Advisor validates Research widget with Research content
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And  user able to see the Research widget with the Research content based on the CMS category set for the Research widget

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

  @NIGP-02_SC08
  Scenario: 08 Advisor verify See More link on top of the Research widget in the dashboard
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And  user able to see the See More link on top of the Research widget in the dashboard

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

    #Market News

  @NIGP-02_SC09
  Scenario: 09 Advisor validates Market News widget
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And  user able to see the Market News widget with the top 2 Categories World Markets and Finance from CNBC as well as displaying the latest news in the dashboard

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

  @NIGP-02_SC10
  Scenario: 10 Advisor verify See More link on top of the “Market News” widget in the dashboard
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
#    And   : user able to see the "<See More link>" on top of the Market News widget in the dashboard

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

  #Copy Right Text

  @NIGP-02_SC11
  Scenario: 11 Advisor validates copy right text
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And  user able to see the CopyRight text at the footer of the web portal

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|


    #Disclaimer

  @NIGP-02_SC12
  Scenario: 12 Advisor validates disclaimer link
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And   user able to see the Disclaimer link at the footer of the web portal
    When  user clicks link Disclaimer
    Then  user able to see the Disclaimer page in a separate browser window within the GROW Platform

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|

    #Privacy Policy

  @NIGP-02_SC13
  Scenario: 13 Advisor validates Privacy Policy link
    Given user is on GROW Platform login screen
    When user enters "<EmailId>" to Advisor Email
    And  user enters "<Password>" to Advisor Password
    And  user clicks on Signin
#    Then  : user navigates to 2FA screen for 2FA authentication
#    When  : user enters "<OTP>" to txt_OTP
#    And   : user clicks btn_Submit
    Then  user navigate to Grow Platform Dashboard Screen
    And   user able to see the PrivacyPolicy link at the footer of the web portal
    When  user clicks link PrivacyPolicy
    Then  user able to see the privacy policy page in a separate browser window within the GROW Platform

  Examples:
  |EmailId|Password|
  |singlife_advisor|Singlife123!|




