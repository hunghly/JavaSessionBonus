# Java Sessions Bonus Exercise

### Setup

From a clean working branch of the sessions exercise, create a new branch called ```shopping-cart``` and checkout to it.


### Instructions

**If the following bonus seems too large, a smaller goal would be to build the needed MVC and sql logic to provide the user with a view to see all the items from the database.**

You will build out a shopping cart feature to add to your AdLister project. Once the feature is complete, the user will be able to visit a list of items and add items to a shopping cart list that is stored in the current session. The list of item names will be accessible when visiting the cart view.

1. Create an Item entity object with the following fields:
	- id (long)
	- name (varchar)
	- priceInCents (int)

2. Add the Item table creation to a migration file for your AdLister.

3. Seed at least ten items.

4. Add the necessary MVC logic so that when a user visits ```/store```, the list of items appear in cards with a button on each card that when pressed, will send a post request to ```/cart``` that will add an item to the shopping cart by adding the item id to an arraylist of item ids stored in the session object. When a user visits ```/cart```, the user sees a list of all the items added to their cart (from the session).

Extra bonuses to consider adding:

- change the styling of the card on the index page of items if the user has already added it to the cart
- prevent the user from adding the same item to the cart multiple times
- add a feature that when the user visits ```/checkout``` a total price of all items in the cart will be displayed
- allow the user to remove an item from the cart

