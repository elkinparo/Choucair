package com.exito.stepdefinitions;

import com.exito.tasks.purchase;
import com.exito.utils.Generate;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class PurchaseManyProductsStepDefinition
{
    @Managed
    WebDriver driver;

    @Given("actor enters the page")
    public void actorEntersThePage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Elkin").whoCan(BrowseTheWeb.with(driver));
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.exito.com/"));
    }
    @When("select {string} different products")
    public void selectDifferentProducts(String option) {
        OnStage.theActorInTheSpotlight().attemptsTo(purchase.format(Generate.date(), option));
    }
    @Then("I see the information correct of the purchase")
    public void iSeeTheInformationCorrectOfThePurchase() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
