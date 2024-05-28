package steps;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.ui.CardPage;


public class CardPageSteps {
CardPage cardPage;

    @When("Click Add to Cart button")
    public void clickAddToCartButton() {
        cardPage.addToCartButton.click();
    }

    @When("Button AddToCart is visible")
    public void checkAddToCartButtonVisible() {
        Assert.isTrue(cardPage.addToCartButton.getText().equals("Add to cart"),"Button has no text AddToCart");
    }

    @Then("Button Remove is visible")
    public void checkRemoveButtonVisible() {
        Assert.isTrue(cardPage.addToCartButton.getText().equals("Remove"), "Button has no text Remove");
    }
}
