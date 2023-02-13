Feature: to validate the login functionality of facebook 


Background:
Given user have to  launch the brouser and facebook url
And user have to maximize the window



Scenario: to validate login with invalid username and invalid pasword

When user have  to  pass the invalid username and invalid password
#onedimensional list
|fgh@gmail|65756765767667|hytf@gmail|6788766555566655|

Then  user have to click login button

And  user have to close the brouser




Scenario: to validate login with invalid username and valid password

When user have  to  pass the invalid username and valid password
#twodimensional list
|java|123345|selenium|7676767676|
|fw|123345|pom|7676767676|
|cucumber|123345|hdhh|7676767676|

Then user have to click login button

And user have to close the brouser

 