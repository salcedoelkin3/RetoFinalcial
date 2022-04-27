package co.com.choucair.retofinancial.questions;

import co.com.choucair.retofinancial.userinterface.RegistroFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question<String> {
    public static Verificar respuesta() { return new Verificar(); }

    @Override
    public String answeredBy(Actor actor) { return Text.of(RegistroFormulario.VER_TXT).viewedBy(actor).asString(); }
}
