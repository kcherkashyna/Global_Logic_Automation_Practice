### Test Design

### Requirements

Functional Requirements: user should be able to add a product to the cart

### Test Scenario Positive

### Test Setup

| # | Product | 
| - | ------- | 
| 1 | Printed Chiffon Dress |
| 2 | Printed Dress (Model demo_3) |
| 3 | Printed Summer Dress (Model demo_6) |
| 4 | Faded Short Sleeve T-shirts |
| 5 | Blouse |
| 6 | Printed Summer Dress (Model demo_5) |
| 7 | Printed Dress (Model demo_4)|
| 8 | Printed Summer (Model demo_5) |
| 9 | Printed Dress (Model demo_4) |
| 10 | Faded Short Sleeve T-shirts |
| 11 | Blouse |

**1** User should be able to add a product to the cart
```gherkin
Given Site is opened
When User clicks on the <Product1>
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Cart" button
Then User sees added product in the cart
```
**2** User should be able to add a product to the cart using "Add to cart" button on the product card
```gherkin
Given Site is opened
When User opens the "Women" catalog
    And User hovers the cursor to the <Product2>
    And User clicks on the on the appeared "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "x" button
    And User hovers the cursor to the cart
Then User sees added product in the cart
```
**3** User should be able to add a product to the cart using "More" button on the product card
```gherkin
Given Site is opened
When User opens the "Dresses" catalog
    And User hovers the cursor to the <Product3>
    And User clicks on the appeared "More" button
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Cart" button
Then User sees added product in the cart
```
**4** User should be able to add a product to the cart using color square button on the product card
```gherkin
Given Site is opened
When User opens the "T-shirts" catalog
    And User hovers the cursor to the <Product4>
    And User clicks on the on the blue square button
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "x" button
    And User hovers the cursor to the cart
Then User sees added product in the cart
```
**5** User should be able to change the amount, quantity and color of product and add it to the cart
```gherkin
Given Site is opened
When User opens the "Women" -> "TOPS" catalog
    User clicks on the <Product5>
    User change quantity from 1 to 5 using "+" button
    User change quantity from 5 to 2 using "-" button
    User change the size of product from "S" to "M"
    User change color from black to white
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Cart" button
Then User sees added product in the right quantity, size and color in the cart
```
**6** User should be able to add 3 products from different catalogs to the cart
```gherkin
Given Site is opened
When User opens the "Women" -> "DRESSES" catalog
    And User clicks on the <Product6>
    User change quantity from 1 to 5 using "+" button
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Dresses" arrow
    And User clicks on the "Evening dresses" link text in the leftmost block
    And User hovers the cursor to the <Product7>
    And User clicks on the on the appeared "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "x" button
    And User clicks on the "Women" arrow 
    And User opens the "DRESSES" subcategory
    And User opens the "SUMMER DRESSES" subcategory
    And User hovers the cursor to the <Product8>
    And User clicks on the appeared "More" button
    User change the size of product from "S" to "L"
    User change color from yellow to black
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Cart" button
Then User sees 3 added products in the cart
```
**7** Registered user should be able to add 3 products from different catalogs to the cart
```gherkin
Given Site is opened
    And User should be signed in
When User opens the "DRESSES" -> "EVENING DRESSES" catalog
    And User clicks on the <Product9>
    User change quantity from 1 to 7 using "+" button
    User change the size of product from "S" to "M"
    User change color from yellow to pink
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Home" arrow
    And User hovers the cursor to the <Product10>
    And User clicks on the on the appeared "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "x" button
    And User opens the "Women" -> "TOPS" -> "Blouses" catalog
    And User hovers the cursor to the <Product11>
    And User clicks on the on the white square button
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Cart" button
Then User sees 3 added products in the cart
```




