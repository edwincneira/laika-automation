#language:en

Feature: Change addresses on the app Merqueo

  @AddressActualLocation
    @AddressTest
    @Android
  Scenario Outline: Change the delivery address to the current location on Android device
    When The user is inside the application with the <email> and <password>
    Then Change your address to the current location where he are

  Examples:
    | email                    | password |
    | edwinchivata@outlook.com | re-5019-6395   |
    | edwinchivata@outlook.com | re-5019-6395   |

  @AddressActualLocation
    @AddressTest
    @iOS
  Scenario Outline: Change the delivery address to the current location on IOS device
    When The user is inside the application with the <email> and <password>
    Then Change your address to the current location where he are

  Examples:
     | email                    | password |
     | edwinchivata@outlook.com | 123456   |
     | edwinchivata@outlook.com | 123456   |

