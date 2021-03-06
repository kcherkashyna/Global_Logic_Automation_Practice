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
When User clicks on the <Product>
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
    And User hovers the cursor to the <Product>
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
    And User hovers the cursor to the <Product>
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
    And User hovers the cursor to the <Product>
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
    And User clicks on the <Product>
    And User change quantity from 1 to 3 using "+" button
    And User change quantity from 3 to 2 using "-" button
    And User change the size of product from "S" to "M"
    And User change color from black to white
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Cart" button
Then User sees added product in the right quantity, size and color in the cart
```
**6** User should be able to add 3 products from different catalogs to the cart
```gherkin
Given Site is opened
When User clicks on the <Product>
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User opens the "Women" catalog
    And User hovers the cursor to the <Product>
    And User clicks on the on the appeared "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "x" button  
    And User opens the "Dresses" catalog
    And User hovers the cursor to the <Product>
    And User clicks on the appeared "More" button
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User clicks on the "Cart" button
Then User sees added product in the cart
```
**7** Registered user should be able to add 3 products from different catalogs to the cart
```gherkin
Given Site is opened
    And User should be signed in
When User opens the "T-shirts" catalog
    And User hovers the cursor to the <Product>
    And User clicks on the on the blue square button
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "x" button
    And User opens the "Women" -> "TOPS" catalog
    And User clicks on the <Product>
    And User clicks on the "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "Continue shopping" button
    And User opens the "Women" catalog
    And User hovers the cursor to the <Product>
    And User clicks on the on the appeared "Add to cart" button
    And window with text "Product successfully added to the shopping cart" is opened
    And User clicks on the "x" button
    And User clicks on the "Cart" button
Then User sees added product in the cart
```




