package co.com.choucair.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://petstore.octoperf.com/actions/Catalog.action")
public class JPetStorePage extends PageObject {

    @FindBy(xpath = "//img[@src='../images/sm_fish.gif']")
    public WebElementFacade petMenu;

    @FindBy(css = "a[href='/actions/Catalog.action?viewProduct=&productId=FI-SW-01']")
    public WebElementFacade selectPet;

    @FindBy(partialLinkText = "EST-1")
    public WebElementFacade productID;

}
