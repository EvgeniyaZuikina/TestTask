package model.ui;

import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

public class LoginPage {

    @FindBy(xpath = "//@id = 'user-name'")
    public WebElement userNameField;

    @FindBy(xpath = "//@id ='password'")
    public WebElement passwordField;

    @FindBy(xpath = "//@id='login-button'")
    public WebElement loginButton;
}
