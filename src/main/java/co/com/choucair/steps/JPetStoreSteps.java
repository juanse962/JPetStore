package co.com.choucair.steps;

import co.com.choucair.pages.interacciones.JPetStorePageInteraction;
import co.com.choucair.pages.mapeos.JPetStorePage;
import co.com.choucair.pages.mapeos.JPetStoreValidationPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class JPetStoreSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(JPetStoreSteps.class);

    @Page
    private JPetStorePage jPetStorePage;
    @Page
    private JPetStoreValidationPage jPetStoreValidationPage;

    @Page
    private JPetStorePageInteraction petStorePageInteraction;

    @Step("user open login page")
    public void openPetStorePage() {
        jPetStorePage.open();
        LOGGER.info("user open login page");
    }

    @Step("clear user and password fields")
    public void lookingForThePet() {
        jPetStorePage.petMenu.click();
        jPetStorePage.selectPet.click();
        jPetStorePage.productID.click();
        LOGGER.info("user successfully performed the action");
    }

    @Step("validate successful login")
    public void successPetSearch() {
        assert petStorePageInteraction.getImage();
        assert petStorePageInteraction.getPrice();
        assert petStorePageInteraction.getProductName();
        LOGGER.info("the user validation is ok");
    }
}