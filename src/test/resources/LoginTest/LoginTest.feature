#language:en

Feature: Change addresses on the app Merqueo

  @InsideApp
    @LoginTest
    @Android
  Scenario Outline: Init session on Android device
    When The user is inside the application with the <email> and <password>
    Then Close the session

    Examples:
      | email                               | password        |
      | eachivatan@correo.udistrital.edu.co | 1234567891011   |
      | edwinchivata@outlook.com            | 1234567891011   |

  @InsideApp
    @LoginTest
    @iOS
  Scenario Outline: Init session on IOS device
    When The user is inside the application with the <email> and <password>
    Then Close the session

    Examples:
      | email                               | password        |
      | edwinchivata@outlook.com            | 1234567891011   |
      | eachivatan@correo.udistrital.edu.co | 1234567891011   |

