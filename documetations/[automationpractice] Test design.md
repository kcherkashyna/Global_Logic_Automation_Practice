### Test Design

1. User should be able to create account
2. User should be able to login in to app
3. User should be able to add a product to cart
4. User should Be able to search for product

### Requirements

Functional Requirements: 

Non-Functional Requirements: 

### Clarifications and Exceptions

### Test Setup

### Test Scenario Positive

| # |               emailAddress             |           password               |
| - | -------------------------------------- | -------------------------------- |
| 1 | emailcontainsonlyletters@gmail.com     | passwordwithonlyletters          |
| 2 | 000777333111222777333@gmail.com        | 1234567890                       |
| 3 | user_&#!777@gmail.com                  | 1_&#!67890                       |
| 4 | EMAILCONTAINSCAPITALLETTERS@gmail.com  | ABCDE                            |
| 5 | long_email_123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890124@gmail.com | 12345678901234567890123456789012 |            

### Test Scenario Negative

| # |       emailAddress       | password |
| - | ------------------------ | -------- |
| 1 |                          |          |
| 2 |                          | 12345    |
| 3 | email1___1@gmail.com     |          |
| 4 | @gmail.com               | 12345    |
| 5 | email2___2@gmail.com     | 1234     |


**1** User should be able to create account
```gherkin
Given "http://automationpractice.com/index.php" site is opened
    And User clicks on the "Sign in" link text
    And "Authentication" page is opened
When User enters <emailAddress> in the "Email address" field located in "Create an account" block
    And User clicks on the "Create an account" button
    And "Create an account" page is opened
    And User enters first name in the "First name" field located in "Your personal information" block
    And User enters last name in the "Last name" field located in "Your personal information" block
    And User enters <password> in the "Password" field
    And User enters address in the "Address" field
    And User enters city in the "City" field
    And User enters address in the "Address" field
    And User choose the state from the drop-down "State" list
    And User enters zip/postal code in the "Zip/Postal Code" field
    And User enters mobile phone in the "Mobile phone" field
    And User clicks on the "Register" button
Then User should see the "My account" page
```

**2** User should be able to login in to app
```gherkin
Given "http://automationpractice.com/index.php" site is opened
    And User should be already registered
    And User clicks on the "Sign out" button
    And "Authentication" page is opened
When User enters <emailAddress> in the "Email address" field located in "Already registered?" block
    And User enters <password> in the "Password" field
    And User clicks on the "Sign in" button
Then User should see the "My account" page
```

**3** User should be able to add a product to cart
```gherkin
Given "http://automationpractice.com/index.php" site is opened
When User clicks on the "Printed Chiffon Dress" product
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Cart" button
Then "Printed Chiffon Dress" product is in the cart
```

**4** User should be able to search for product
```gherkin
Given "http://automationpractice.com/index.php" site is opened
When User enters "blouse" text in the "Search" searchfield
Then User sees one "Blouse" showing in the results
```


