package co.com.google.qa.miprimerserenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject{
	
	@FindBy(name="q")
    private WebElementFacade inputBuscar;

    @FindBy(name="btnk")
    private WebElementFacade botonBuscar;

    public void palabraClave(String keyword) {
    	inputBuscar.typeAndEnter(keyword);
    }

    public void buscarTerminos() {
        //botonBuscar.waitUntilClickable().click();
    }

}
