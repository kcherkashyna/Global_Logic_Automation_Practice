### Test Design

### Requirements

Functional Requirements: user should be able to login in to app

### Test Scenario Positive

### Test Setup

| # | EmailAddress | Password |
| - | ------------ | -------- |
| 1 | a@testemail.com | qawsedrftgyhu |
| 2 | 000111222333@gmail.com | 1234567890 |
| 3 | abcde!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com | password_1234567890123456!@#$%&+ |

**1** User should be able to login in to app
```gherkin
Given Site is opened
    And User should be already registered
    And User clicks on the "Sign in" link text
When User enters <EmailAddress> in the "Email address" field
    And User enters <Password> in the "Password" field
    And User clicks on the "Sign in" button
Then User should see the "My account" page
    And User clicks on the "Sign out" button
```

### Test Scenario Negative

### Test Setup

| # | EmailAddress | Password |
| - | ------------ | -------- |
| 1 | empty | empty |
| 2 | empty | ebcde |
| 3 | a@testemail.com | empty |
| 4 | test@email52.com | ebcde |
| 5 | test_email16@ | abcde |
| 6 | @test_email17.com | abcde | 
| 7 | test_email18@a | abcde | 
| 8 | test@email@19.com | abcde |
| 9 | .test@email20.com | abcde |
| 10 | test@email21com | abcde |
| 11 | abcde!#$%&01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789@gmai.com | abcde |
| 12 | test@email31.com | 1234 |
| 13 | test@email32.com | password_12345678901234567!@#$%&+ |

**1** User tries to login with invalid credentials
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters incorrect data to the "Email address" and/or "Password" fields
    And User clicks on the "Sign in" button
Then User should see the error message text
```
