package co.com.google.qa.miprimerserenity.stepsdefinitions;

import co.com.google.qa.miprimerserenity.steps.EndUserStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaEnGoogleStepDefinition {
	@Steps
	EndUserStep daniel;
	
	@Given("^daniel esta en el sitio google$")
	public void daniel_esta_en_el_sitio_google() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		daniel.estaEnLaPaginaPrincipalGoogle();
	}
	
	
	@When("^el busca la frase  \"([^\"]*)\" comuesta \"([^\"]*)\"$")
	public void el_busca_la_frase_comuesta(String palabraUno, String palabraDos) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		daniel.buscarFrase(palabraUno + " " + palabraDos);
		
	}
	
	@Then("^el verifica que la \"([^\"]*)\" este en los resultados$")
	public void el_verifica_que_la_este_en_los_resultados(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
}
