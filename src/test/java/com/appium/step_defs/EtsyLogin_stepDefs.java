package com.appium.step_defs;

import com.appium.pages.EtsyLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EtsyLogin_stepDefs {
    EtsyLoginPage etsyLoginPage = new EtsyLoginPage();

    @Given("use clicks on get started")
    public void use_clicks_on_get_started() {

          }

    @When("user logs in with etsy credentials")
    public void user_logs_in_with_etsy_credentials() throws InterruptedException {
        etsyLoginPage.login();
//        MobileUtilities.wait(10);//for demo
    }

    @Then("user verifies that etsy logo is displayed")
    public void user_verifies_that_etsy_logo_is_displayed() {

    }

}
