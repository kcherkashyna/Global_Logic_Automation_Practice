### Test Design

### Requirements

Functional Requirements: user should be able to login in to app

### Test Scenario Positive

### Test Setup

| # | EmailAddress | Password |
| - | ------------ | -------- |
| 1 | a@testemail.com | ebcde |
| 2 | 000111222333@gmail.com | 1234567890 |
| 3 | abcde!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com | password_1234567890123456!@#$%&+ |

**1-3** User should be able to login in to app
```gherkin
Given Site is opened
    And User should be already registered
    And User clicks on the "Sign in" link text
When User enters <emailAddress1-3> in the "Email address" field
    And User enters <password1-3> in the "Password" field
    And User clicks on the "Sign in" button
Then User should see the "My account" page
    And User clicks on the "Sign out" button
```

### Test Scenario Negative

### Test Setup

| # | EmailAddress | Password |
| - | ------------ | -------- |
| 4 | empty | empty |
| 5 | empty | ebcde |
| 6 | a@testemail.com | empty |
| 7 | test@email52.com | ebcde |
| 8 | test_email16@ | abcde |
| 9 | @test_email17.com | abcde | 
| 10 | test_email18@a | abcde | 
| 11 | test@email@19.com | abcde |
| 12 | .test@email20.com | abcde |
| 13 | test@email21com | abcde |
| 14 | abcde!#$%&01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789@gmai.com | abcde |
| 15 | test@email31.com | 1234 |
| 16 | test@email32.com | password_12345678901234567!@#$%&+ |

**4** User tries to login with empty email and password
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User doesn't enter anything in the "Email address" and "Password" fields
    And User clicks on the "Sign in" button
Then User should see the error message text
    (And User clicks on the "Sign out" button - if it's present)
```
**5** User tries to login with empty email
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User doesn't enter anything in the "Email address" field
    And User enters <Password5> in the "Password" field
    And User clicks on the "Sign in" button
Then User should see the error message text
    (And User clicks on the "Sign out" button - if it's present)
```
**6** User tries to login with empty password
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress6> in the "Email address" field
    And User doesn't enter anything in the "Password" field
    And User clicks on the "Sign in" button
Then User should see the error message text
    (And User clicks on the "Sign out" button - if it's present)
```
**7** User tries to login with unregistered account
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress7> in the "Email address" field
    And User enters <Password7> in the "Password" field
    And User clicks on the "Sign in" button
Then User should see the error message text
    (And User clicks on the "Sign out" button - if it's present)
```
**8-14** User tries to login with wrong email
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress8-14> in the "Email address" field
    And User enters <Password8-14> in the "Password" field
    And User clicks on the "Sign in" button
Then User should see the error message text
    (And User clicks on the "Sign out" button - if it's present)
```
**15-16** User tries to login with wrong password
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress15-16> in the "Email address" field
    And User enters <Password15-16> in the "Password" field
    And User clicks on the "Sign in" button
Then User should see the error message text
    (And User clicks on the "Sign out" button - if it's present)
```

