package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;

public class LoginStep {

    //method2 mappingannya di sini

    @Steps
    LoginPage loginPage;

    @Given("I am on login page")
    public void iAmOnLoginPage() {
        loginPage.goToLoginPage();
    }

    @When("I input correct username and correct password")
    public void iInputCorrectUsernameAndCorrectPassword() {
        loginPage.inputUsername();
        loginPage.inputPassword();
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will go to product page")
    public void iWillGoToProductPage() {
        loginPage.verifyProductHeader();
    }
}
