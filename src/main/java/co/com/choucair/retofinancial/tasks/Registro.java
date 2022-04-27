package co.com.choucair.retofinancial.tasks;

import co.com.choucair.retofinancial.model.Formulario;
import co.com.choucair.retofinancial.userinterface.RegistroFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Registro implements Task {
    private Formulario formulario;

    public Registro(Formulario formulario) {
        this.formulario = formulario;
    }

    public static Registro usuario(Formulario formulario) {
        return Tasks.instrumented(Registro.class, formulario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(formulario.getName()).into(RegistroFormulario.ADD_NAME),
                Enter.theValue(formulario.getLast()).into(RegistroFormulario.ADD_LAST),
                Enter.theValue(formulario.getAddres()).into(RegistroFormulario.ADD_ADRESS),
                Enter.theValue(formulario.getEmail()).into(RegistroFormulario.ADD_EMAIL),
                Enter.theValue(formulario.getPhone()).into(RegistroFormulario.ADD_PHONE),
                Click.on(RegistroFormulario.ADD_GENDER),
                Click.on(RegistroFormulario.ADD_HOBBIE1),
                Click.on(RegistroFormulario.ADD_HOBBIE2),
                Click.on(RegistroFormulario.CLIC_LANGU),
                Click.on(RegistroFormulario.ADD_LANGU1),
                Click.on(RegistroFormulario.ADD_LANGU2),
                Click.on(RegistroFormulario.ADD_SKILLS),
                Click.on(RegistroFormulario.ADD_COUNTRY),
                Click.on(RegistroFormulario.ADD_YEAR),
                Click.on(RegistroFormulario.ADD_MONTH),
                Click.on(RegistroFormulario.ADD_DAY),
                Enter.theValue(formulario.getPassword()).into(RegistroFormulario.ADD_PASS),
                Enter.theValue(formulario.getConfirm()).into(RegistroFormulario.CONF_PASS),
                Click.on(RegistroFormulario.BUTTON));

    }
}
