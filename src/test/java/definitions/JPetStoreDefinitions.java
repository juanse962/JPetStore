package definitions;

import co.com.choucair.pages.interacciones.JPetStorePageInteraction;
import co.com.choucair.pages.mapeos.JPetStorePage;
import co.com.choucair.pages.mapeos.JPetStoreValidationPage;
import co.com.choucair.steps.JPetStoreSteps;
import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JPetStoreDefinitions {

    @Steps
    private JPetStoreSteps jPetStoreSteps;

    @Given("The user enters the page")
    public void theUserEntersThePage() {
        jPetStoreSteps.openPetStorePage();
    }

    @When("We are looking for the pet in the store")
    public void weAreLookingForThePetInTheStore() {
        jPetStoreSteps.lookingForThePet();
    }

    @Then("You should see the pets main page")
    public void shouldThePet(){
        jPetStoreSteps.successPetSearch();
    }
}
