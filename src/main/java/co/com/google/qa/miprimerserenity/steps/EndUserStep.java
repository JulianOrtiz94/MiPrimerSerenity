package co.com.google.qa.miprimerserenity.steps;

import co.com.google.qa.miprimerserenity.pages.GoogleHomePage;
import net.thucydides.core.annotations.Step;


public class EndUserStep {
	
    GoogleHomePage googlePage;

    @Step
    public void estaEnLaPaginaPrincipalGoogle() {
    	googlePage.open();
    }

    @Step
    public void ingresaElTexto(String keyword) {
        googlePage.palabraClave(keyword);
    }

    @Step
    public void startsSearch() {
    	googlePage.buscarTerminos();
    }

    @Step
    public void buscarFrase(String term) {
    	ingresaElTexto(term);
        startsSearch();
    
    }
}