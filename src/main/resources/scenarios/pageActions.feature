Feature: UI-testing

  Scenario:
    Given User opens new browser window and follows the link
    Given User authorized on website

    When Click to sorting dropdown field
    When Check cart is empty
    When Click to left down card
    When Click Add to Cart button
    When Button AddToCart is visible

    Then Button Remove is visible
    Then Check cart has one item
