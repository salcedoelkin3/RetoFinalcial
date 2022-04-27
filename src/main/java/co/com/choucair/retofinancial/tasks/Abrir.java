package co.com.choucair.retofinancial.tasks;
import co.com.choucair.retofinancial.userinterface.PaginaAutomation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class Abrir implements Task {
    private PaginaAutomation paginaAutomation;
    public static Abrir Pagina() { return Tasks.instrumented(Abrir.class); }

    @Override
    public <T extends Actor> void performAs(T actor) { actor.attemptsTo(Open.browserOn(paginaAutomation));

    }
}
