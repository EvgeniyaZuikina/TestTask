package steps;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.ui.MainPage;
import org.openqa.selenium.support.ui.Select;

public class MainPageSteps {
MainPage mainPage;

    @When("Click to sorting dropdown field")
    public void clickToSortZtoADropDownField() {
        Select select = new Select(mainPage.sortDropDownField);
        select.selectByVisibleText("Name (Z to A)");
    }

    @When("Click to left down card")
    public void clickToCard() {
        mainPage.cardNameSauceLabsBikeLight.click();
    }

    @Then("Check cart has one item")
    public void checkCartHasOneItem() {
        Assert.isTrue(mainPage.shoppingCart.getText().equals("1"), "Cart is empty");
    }

    @When("Check cart is empty")
    public void checkCartIsEmpty() {
        Assert.isTrue(mainPage.shoppingCart.getText().equals("0"), "Cart is not empty");
    }

    }
