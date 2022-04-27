package co.com.choucair.retofinancial.stepdefinitions;

import co.com.choucair.retofinancial.model.Formulario;
import co.com.choucair.retofinancial.questions.Verificar;
import co.com.choucair.retofinancial.tasks.Abrir;
import co.com.choucair.retofinancial.tasks.Registro;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import java.util.List;

public class RetoFinancialStepDefinitions {
    @Before
    public void setStage(){OnStage.setTheStage(new OnlineCast());}

    @Given("^que Elkin quiere registrarse en la pagina$")
    public void queElkinQuiereRegistrarseEnLaPagina()  {
        OnStage.theActorCalled("Elkin").wasAbleTo(Abrir.Pagina());
    }

    @When("^el realiza el registro en la pagina$")
    public void elRealizaElRegistroEnLaPagina(List<Formulario> formulario)  {
        OnStage.theActorInTheSpotlight().attemptsTo(Registro.usuario(formulario.get(0)));
    }

    @Then("^verifica que se presente en pantalla el mensaje Double Click on Edit icon to EDIT the Table Row$")
    public void verificaQueSePresenteEnPantallaElMensajeDoubleClickOnEditIconToEDITTheTableRow(List<Formulario> formulario)  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.respuesta(), Matchers.equalTo(formulario.get(0).getVerificar())));
    }
}
