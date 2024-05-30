package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import model.api.User;

import static io.restassured.RestAssured.given;
import static model.api.ApiClient.getBaseSpec;
import static org.hamcrest.Matchers.equalTo;

public class PostApiSteps {
ValidatableResponse response;

    @When("Post user info")
    public void sendRequest(User user) {
        ValidatableResponse response = given()
                .spec(getBaseSpec())
                .body(user)
                .when()
                .post()
                .then()
                .log().all();
    }

    @Then("Check status code, name and job")
    public void getResponse(User user) {
        response.assertThat()
                .body("name", equalTo(user.getName()))
                .body("job", equalTo(user.getJob()))
                .statusCode(201);
    }
}
