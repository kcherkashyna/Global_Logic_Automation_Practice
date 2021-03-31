### Test Design

### Requirements

Functional Requirements: user should be able to create account

### Test Scenario Positive

### Test Setup

| # | Email | FirstName | LastName | Password | Address | City | State | Zip/PostalCode | Country | MobilePhone |
| - | ----- | --------- | -------- | -------- | ------- | ---- | ----- | -------------- | ------- | ----------- |
| 1 | a@testemail1.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 2 | 2000111222333@gmail.com | A | B | 1234567890 | D | E | Wyoming | 11111 | United States | 3 |
| 3 | abcde!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com | First-Name-AAAAAAAAAAAAAAAAAAAAA | Last-Name-BBBBBBBBBBBBBBBBBBBBBB | password_1234567890123456!@#$%&+ | Address#&(,./-;'"012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890 | City&-0123456789012345678901234567890123456789012345678901234567 | Texas | 09876 | United States | 0123456789-0123456789-0123456789 |

**1** User creates account with filling of only required fields
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress> in the "Email address" field
    And User clicks on the "Create an account" button
    And User fills in all required fields
    And User clicks on the "Register" button
Then User should see the "My account" page
```

### Test Setup

| # | Email | FirstName | LastName | Password | Address | City | State | Zip/PostalCode | Country | MobilePhone | FirstNameYourAddress | LastNameYourAddress | AddressAlias |
| - | ----- | --------- | -------- | -------- | ------- | ---- | ----- | -------------- | ------- | ----------- | -------------------- | ------------------- | ------------ |
| 1 | a@testemail3.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | Jack | Doe | Jack's address |
| 2 | 400011122233@gmail.com | A | B | 1234567890 | D | E | Wyoming | 11111 | United States | 3 | C | D | E |
| 3 | abcde!#$%&0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678@gmai.com | First-Name-AAAAAAAAAAAAAAAAAAAAA | Last-Name-BBBBBBBBBBBBBBBBBBBBBB | password_1234567890123456!@#$%&+ | Address#&(,./-;'"012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890 | City&-0123456789012345678901234567890123456789012345678901234567 | Texas | 09876 | United States | 0123456789-0123456789-0123456789 | First-Name-CCCCCCCCCCCCCCCCCCCCC | Last-Name-DDDDDDDDDDDDDDDDDDDDDD | Address_Alias_!@#$%&.,()_1234567 |

**2** User creates account with filling of all required fields and changing default fields
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters <EmailAddress> in the "Email address" field
    And User clicks on the "Create an account" button
    And User fills in all required fields
    And User changes fields with default data - "First name", "Last name", "Address alias"
    And User clicks on the "Register" button
Then User should see the "My account" page
```
**3** User creates account with filling of all required and optional fields
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters email in the "Email address" field
    And User clicks on the "Create an account" button
    And User fills in all required and optional fields
    And User clicks on the "Register" button
Then User should see the "My account" page
```
### Test Scenario Negative

### Test Setup

| # | Email | FirstName | LastName | Password | Address | City | State | Zip/PostalCode | Country | MobilePhone | 
| - | ------| --------- | -------- | -------- | ------- | ---- | ----- | -------------- | ------- | ----------- |
| 1 | empty | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 2 | test@email5.com | empty | empty | empty | empty | empty | empty | empty | United States | empty | default |
| 3 | test@email6.com | empty | Wick | 12345 | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 4 | test@email7.com | John | empty | 12345 | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 5 | test@email8.com | John | Wick | empty | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 6 | test@email9.com | John | Wick | abcde | empty | Manhattan | New York | 12345 | United States | +380931234567 |
| 7 | test@email10.com | John | Wick | abcde | Fifth Avenue | empty | New York | 12345 | United States | +380931234567 |
| 8 | test@email11.com | John | Wick | abcde | Fifth Avenue | Manhattan | empty | 12345 | United States | +380931234567 |
| 9 | test@email12.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | empty | United States | +380931234567 |
| 10 | test@email13.com | John | Wick | abcde | Fifth Avenue | Manhattan | empty | empty | empty | +380931234567 |
| 11 | test@email14.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | empty |
| 12 | a@testemail.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 13 | test_email16@ | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 14 | @test_email17.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 15 | test_email18@a | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 16 | test@email@19.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 17 | .test@email20.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 18 | test@email21com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 19 | abcde!#$%&01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789@gmai.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 20 | test@email23.com | " " | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 21 | test@email24.com | John1 | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 22 | test@email25.com | John! | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 23 | test@email26.com | First-Name-AAAAAAAAAAAAAAAAAAAAAA | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 24 | test@email27.com | John | " " | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 25 | test@email28.com | John | Wick-2 | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 26 | test@email29.com | John | Wick$ | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 27 | test@email30.com | John | Last-Name-BBBBBBBBBBBBBBBBBBBBBB | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 28 | test@email31.com | John | Wick | 1234 | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 29 | test@email32.com | John | Wick | password_12345678901234567!@#$%&+ | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 |
| 30 | test@email33.com | John | Wick | abcde | Address#&(,./-;'"0123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901 | Manhattan | New York | 12345 | United States | +380931234567 |
| 31 | test@email34.com | John | Wick | abcde | Fifth Avenue | City&-01234567890123456789012345678901234567890123456789012345678 | New York | 12345 | United States | +380931234567 |
| 32 | test@email35.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 1234 | United States | +380931234567 |
| 33 | test@email36.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 123456 | United States | +380931234567 |
| 34 | test@email37.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | FGHIJ | United States | +380931234567 |
| 35 | test@email38.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | 123456789 |
| 36 | test@email39.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | 0123456789-0123456789-01234567890 |

### Test Setup

| # | Email | FirstName | LastName | Password | Address | City | State | Zip/PostalCode | Country | MobilePhone | FirstNameYourAddress | LastNameYourAddress | AddressAlias |
| - | ------| --------- | -------- | -------- | ------- | ---- | ----- | -------------- | ------- | ----------- | -------------------- | ------------------- | ------------ |
| 1 | test@email40.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | empty | default | default |
| 2 | test@email41.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | " " | default | default |
| 3 | test@email42.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | John1 | default | default |
| 4 | test@email43.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | John! | default | default |
| 5 | test@email44.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | First-Name-AAAAAAAAAAAAAAAAAAAAAA | default | default |
| 6 | test@email45.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | empty | default |
| 7 | test@email46.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | " " | default |
| 8 | test@email47.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | Wick-2 | default |
| 9 | test@email48.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | Wick$ | default |
| 10 | test@email49.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | Last-Name-BBBBBBBBBBBBBBBBBBBBBB | default |
| 11 | test@email50.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | empty |
| 12 | test@email51.com | John | Wick | abcde | Fifth Avenue | Manhattan | New York | 12345 | United States | +380931234567 | default | default | Address_Alias_!@#$%&.,()_12345678 |

**1** User tries to create account with invalid email
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When User enters incorrect data in the "Email address" field
    And User clicks on the "Create an account" button
Then User should see the error message text
```
**2** User tries to create account with invalid credentials
```gherkin
Given Site is opened
    And User clicks on the "Sign in" link text
When When User enters <Email> in the "Email address" field
    And User clicks on the "Create an account" button
    And User enters incorrect data in all/one of the fields
    And User clicks on the "Register" button
Then User should see the error message text
```