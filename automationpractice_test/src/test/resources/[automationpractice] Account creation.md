### Test Design

### Requirements

Functional Requirements: user should be able to create account

### Test Scenario Positive

### Test Setup

| # | EmailAddress | FirstName | LastName | Password | Address | City | State | Zip/PostalCode | Country | MobilePhone | FirstNameYourAddress | LastNameYourAddress | AddressAlias |
| - | -------------| --------- | -------- | -------- | ------- | ---- | ----- | -------------- | ------- | ----------- | -------------------- | ------------------- | ------------ |
| 1 | a@testemail.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default | 
| 2 | 000111222333@gmail.com | A | B | 1234567890 | D | E | Wyoming | 11111 | United States | 3 | default | default | default |
| 3 | abcde!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com | First-Name-AAAAAAAAAAAAAAAAAAAAA | Last-Name-BBBBBBBBBBBBBBBBBBBBBB | password_1234567890123456!@#$%&+ | Address#&(,./-;'"012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890 | City&-0123456789012345678901234567890123456789012345678901234567 | Texas | 09876 | United States | 0123456789-0123456789-0123456789 | First-Name-CCCCCCCCCCCCCCCCCCCCC | Last-Name-DDDDDDDDDDDDDDDDDDDDDD | Address_Alias_!@#$%&.,()_1234567 |

**1** User creates account with filling of only required fields
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress1> in the "Email address" field
    And User clicks on the "Create an account" button
    And User fills in all required fields
    And User clicks on the "Register" button
Then User should see the "My account" page
```
**2** User creates account with filling of all (required and optional) fields
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress2> in the "Email address" field
    And User clicks on the "Create an account" button
    And User fills in all (required and optional) fields
    And User clicks on the "Register" button
Then User should see the "My account" page
```
**3** User creates account with filling of all required and 5 optional fields with different data
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress3> in the "Email address" field
    And User clicks on the "Create an account" button
    And User fills in all required fields
    And User choose other radiobutton "Mr." or "Mrs." than in test case 2
    And User choose other "Date of Birth" than in test case 2
    And User change default data to <FirstNameYourAddress3>, <LastNameYourAddress3>, <AddressAlias3> in "FirstNameYourAddress", "LastNameYourAddress", "AddressAlias" fields 
    And User clicks on the "Register" button
Then User should see the "My account" page
```
### Test Scenario Negative

### Test Setup

| # | EmailAddress | FirstName | LastName | Password | Address | City | State | Zip/PostalCode | Country | MobilePhone | FirstNameYourAddress | LastNameYourAddress | AddressAlias |
| - | -------------| --------- | -------- | -------- | ------- | ---- | ----- | -------------- | ------- | ----------- | -------------------- | ------------------- | ------------ |
| 4 | empty | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 5 | test@email5.com | empty | empty | empty | empty | empty | empty | empty | United States | empty | default | default | default |
| 6 | test@email6.com | empty | Wick | 12345 | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 7 | test@email7.com | John | empty | 12345 | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 8 | test@email8.com | John | Wick | empty | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 9 | test@email9.com | John | Wick | abcde | empty | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 10 | test@email10.com | John | Wick | abcde | Fifth Avenue | empty | New York | 12345 | United States | +380931234567 | default | default | default |
| 11 | test@email11.com | John | Wick | abcde | Fifth Avenue | Manhattan | empty | 12345 | United States | +380931234567 | default | default | default |
| 12 | test@email12.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | empty | United States | +380931234567 | default | default | default |
| 13 | test@email13.com | John | Wick | abcde | Fifth Avenue | Manhattan | empty | empty | empty | +380931234567 | default | default | default |
| 14 | test@email14.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | empty | default | default | default |
| 15 | a@testemail.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 16 | test_email16@ | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 17 | @test_email17.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 18 | test_email18@a | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 19 | test@email@19.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 20 | .test@email20.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 21 | test@email21com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 22 | abcde!#$%&01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789@gmai.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 23 | test@email23.com | " " | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 24 | test@email24.com | John1 | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 25 | test@email25.com | John! | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 26 | test@email26.com | First-Name-AAAAAAAAAAAAAAAAAAAAAA | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 27 | test@email27.com | John | " " | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 28 | test@email28.com | John | Wick-2 | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 29 | test@email29.com | John | Wick$ | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 30 | test@email30.com | John | Last-Name-BBBBBBBBBBBBBBBBBBBBBB | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 31 | test@email31.com | John | Wick | 1234 | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 32 | test@email32.com | John | Wick | password_12345678901234567!@#$%&+ | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 33 | test@email33.com | John | Wick | abcde | Address#&(,./-;'"0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901 | Manhattan | New York | 12345 | United States | +380931234567 | default | default | default |
| 34 | test@email34.com | John | Wick | abcde | Fifth Avenue | City&-01234567890123456789012345678901234567890123456789012345678 | New York | 12345 | United States | +380931234567 | default | default | default |
| 35 | test@email35.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 1234 | United States | +380931234567 | default | default | default |
| 36 | test@email36.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 123456 | United States | +380931234567 | default | default | default |
| 37 | test@email37.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | FGHIJ | United States | +380931234567 | default | default | default |
| 38 | test@email38.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | 123456789 | default | default | default |
| 39 | test@email39.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | 0123456789-0123456789-01234567890 | default | default | default |
| 40 | test@email40.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | empty | default | default |
| 41 | test@email41.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | " " | default | default |
| 42 | test@email42.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | John1 | default | default |
| 43 | test@email43.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | John! | default | default |
| 44 | test@email44.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | First-Name-AAAAAAAAAAAAAAAAAAAAAA | default | default |
| 45 | test@email45.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | empty | default |
| 46 | test@email46.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | " " | default |
| 47 | test@email47.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | Wick-2 | default |
| 48 | test@email48.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | Wick$ | default |
| 49 | test@email49.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | Last-Name-BBBBBBBBBBBBBBBBBBBBBB | default |
| 50 | test@email50.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | empty |
| 51 | test@email51.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | Address_Alias_!@#$%&.,()_12345678 |

**4** User tries to create account with empty "Email address" field
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User doesn't enter anything in the "Email address" field
    And User clicks on the "Create an account" button
Then User should see the error message text
```
**5** User tries to create account with empty required fields
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress5> in the "Email address" field
    And User clicks on the "Create an account" button
    And User leaves empty all required fields
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**6-14** User tries to create an account leaving one of the required fields empty
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress6-14> in the "Email address" field
    And User clicks on the "Create an account" button
    And User leaves empty of the required fields and fills in all other
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**15** User tries to create an account with already registered email
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress15> in the "Email address" field
    And User clicks on the "Create an account" button
Then User should see the error message text
```
**16-22** User tries to create an account with wrong email
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress16-22> in the "Email address" field
    And User clicks on the "Create an account" button
Then User should see the error message text
```
**23-26** User tries to create an account with wrong first name
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress23-26> in the "Email address" field
    And User clicks on the "Create an account" button
    And User enters <FirstName23-26> in the "First name" field
    And User fills in all other required fields with correct data
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**27-30** User tries to create an account with wrong last name
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress27-30> in the "Email address" field
    And User clicks on the "Create an account" button
    And User enters <LastName27-30> in the "Last name" field
    And User fills in all other required fields with correct data
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**31-32** User tries to create an account with wrong password
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress31-32> in the "Email address" field
    And User clicks on the "Create an account" button
    And User enters <Password31-32> in the "Password" field
    And User fills in all other required fields with correct data
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**33** User tries to create an account with wrong address
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress33> in the "Email address" field
    And User clicks on the "Create an account" button
    And User enters <Address33> in the "Address" field
    And User fills in all other required fields with correct data
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```

**34** User tries to create an account with wrong city
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress34> in the "Email address" field
    And User clicks on the "Create an account" button
    And User enters <City34> in the "City" field
    And User fills in all other required fields with correct data
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**35-37** User tries to create an account with wrong zip/postal code
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress35-37> in the "Email address" field
    And User clicks on the "Create an account" button
    And User enters <Zip/PostalCode35-37> in the "Zip/Postal Code" field
    And User fills in all other required fields with correct data
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**38-39** User tries to create an account with wrong mobile phone
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress38-39> in the "Email address" field
    And User clicks on the "Create an account" button
    And User enters <MobilePhone38-39> in the "Mobile Phone" field
    And User fills in all other required fields with correct data
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**40-44** User tries to create an account with empty/wrong first name in "Your address" block
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress40-44> in the "Email address" field
    And User clicks on the "Create an account" button
    And User fills in all required fields with correct data
    And User change default first name to <FirstNameYourAddress40-44> in the "First name" field
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**45-49** User tries to create an account with empty/wrong last name in "Your address" block
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress45-49> in the "Email address" field
    And User clicks on the "Create an account" button
    And User fills in all required fields with correct data
    And User change default last name to <LastNameYourAddress45-49> in the "Last name" field
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```
**50-51** User tries to create an account with empty/wrong address alias
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress50-51> in the "Email address" field
    And User clicks on the "Create an account" button
    And User fills in all required fields with correct data
    And User change default address alias to <AddressAlias50-51> in the "Assign an address alias for future reference." field
    And User clicks on the "Register" button
Then User can't register the account and should see the error message text
```