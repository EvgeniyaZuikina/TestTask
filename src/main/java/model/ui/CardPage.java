package model.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class CardPage {

    @FindBy(xpath = "//@class = 'btn btn_secondary btn_small btn_inventory '")
    public WebElement addToCartButton;
}
