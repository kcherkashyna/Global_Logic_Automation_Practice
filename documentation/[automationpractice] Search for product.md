### Test Design

### Requirements

Functional Requirements: user should be able to search for product

### Test Scenario Positive

### Test Setup

| # | SearchText |
| - | ---------- |
| 1 | blouse |
| 2 | t-shirt |
| 3 | DRESS |

**1** User should be able to submit search request by clicking Enter
```gherkin
Given Site is opened
When User enters <SearchText> in the "Search" field
    And User clicks on "Enter" button
Then User sees one blouse showing in the results
```
**2** User should be able to search for a product using "Magnifier" button
```gherkin
Given Site is opened
When User enters <SearchText> in the "Search" field
    And User clicks on "Magnifier" button
Then User sees one t-shirt showing in the results
```
**3** Registered user search for a product and should see suitable products in drop-down list
```gherkin
Given Site is opened
    And User should be signed in
When User enters <SearchText> in the "Search" field
    And User clicks on some row from drop-down list
Then User sees "Printed Dress" product page
```

### Test Scenario Negative

### Test Setup

| # | SearchText |
| - | ---------- |
| 6 | empty |
| 7 | trousers |
| 8 | qwerty12345 |

**4** User tries to search for a product without searchText
```gherkin
Given Site is opened
When User doesn't enter anything in the "Search" field
    And User clicks on "Enter" button
Then User sees the "Please enter a search keyword" message
```
**5** User tries to search for a product which is absent on the site
```gherkin
Given Site is opened
When User enters <SearchText> in the "Search" field
    And User clicks on "Magnifier" button
Then User sees the message "No results were found for your search <SearchText>" 
```
**6** User tries to search using meaningless text
```gherkin
Given Site is opened
When User enters <SearchText> in the "Search" field
    And User clicks on "Enter" button
Then User sees the message "No results were found for your search <SearchText>"
```



