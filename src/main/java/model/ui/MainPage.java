package model.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class MainPage {

    @FindBy(xpath = "//@class = 'product_sort_container'")
    public WebElement sortDropDownField;

    @FindBy(xpath = "//@class = 'inventory_item_name '/[contains(text(), 'Sauce Labs Bike Light']")
    public WebElement cardNameSauceLabsBikeLight;

    @FindBy(xpath = "//@class = 'shopping_cart_badge'")
    public WebElement shoppingCart;
}
