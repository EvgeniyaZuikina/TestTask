package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.given;
import static model.api.ApiClient.getBaseSpec;
import static org.apache.http.HttpStatus.SC_OK;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

public class GetApiSteps {
ValidatableResponse response;

    @When("Get user info")
    public ValidatableResponse sendRequest() {
        return given()
                .spec(getBaseSpec())
                .when()
                .get("?page=2")
                .then();
    }

        @Then("Check status code, page and first name")
        public void getUsersInfo() {
        response.assertThat()
                .body("page", equalTo(2));
        int actualStatusCode = response.extract().statusCode();
        String firstName = response.extract().path("first_name");
        assertEquals("First name should be Lindsay", "Lindsay", firstName);
        assertEquals("Status code should be 200", SC_OK, actualStatusCode);
    }
}
