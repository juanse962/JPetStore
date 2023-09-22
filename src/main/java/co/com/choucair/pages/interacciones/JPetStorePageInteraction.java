package co.com.choucair.pages.interacciones;

import co.com.choucair.pages.mapeos.JPetStoreValidationPage;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;

public class JPetStorePageInteraction extends PageObject {

    @Page
    private JPetStoreValidationPage jPetStoreValidationPage;

    public boolean getImage() {
        return jPetStoreValidationPage.petImage.waitUntilVisible().isPresent();
    }
    public boolean getPrice() {
        return jPetStoreValidationPage.price.waitUntilVisible().isPresent();
    }

    public boolean getProductName() {
        return jPetStoreValidationPage.productName.waitUntilVisible().isPresent();
    }
}
