package co.com.choucair.pages.interacciones;

import co.com.choucair.pages.mapeos.JPetStoreValidationPage;
import net.thucydides.core.pages.PageObject;
import org.fluentlenium.core.annotation.Page;

public class JPetStorePageInteraction extends PageObject {

    @Page
    private JPetStoreValidationPage jPetStoreValidationPage;

    public boolean getImage() {
        return jPetStoreValidationPage.txtTitleMainPage.waitUntilVisible().isPresent();
    }

}
