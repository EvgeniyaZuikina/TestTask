package steps;

import io.cucumber.java.en.Given;
import model.ui.LoginPage;
import model.ui.MainPage;

public class LoginPageSteps {
LoginPage loginPage;
MainPage mainPage;

    @Given("User authorized on website")
    public MainPage logIn() {
        loginPage.userNameField.sendKeys("user.login");
        loginPage.passwordField.sendKeys("user.password");
        loginPage.loginButton.click();
        return mainPage;
    }
}
