package co.com.choucair.retofinancial.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroFormulario extends PageObject {
    public static final Target ADD_NAME = Target.the("ingresa nombre de usuario")
            .located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target ADD_LAST = Target.the("ingresa apellido de usuario")
            .located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target ADD_ADRESS = Target.the("ingresa direccion de usuario")
            .located(By.xpath("//textarea[@ng-model='Adress']"));
    public static final Target ADD_EMAIL = Target.the("ingresa email deL usuario")
            .located(By.xpath("//input[@type='email']"));
    public static final Target ADD_PHONE = Target.the("ingresa telefono del usuario")
            .located(By.xpath("//input[@type='tel']"));
    public static final Target ADD_GENDER = Target.the("ingresa genero del usuario")
            .located(By.xpath("//input[@value='Male']"));
    public static final Target ADD_HOBBIE1 = Target.the("ingresa hobbies1 del usuario")
            .located(By.id("checkbox1"));
    public static final Target ADD_HOBBIE2 = Target.the("ingresa hobbies2 del usuario")
            .located(By.id("checkbox2"));
    public static final Target CLIC_LANGU = Target.the("selecciona idiomas del usuario")
            .located(By.id("msdd"));
    public static final Target ADD_LANGU1 = Target.the("ingresa idioma1 del usuario")
            .located(By.xpath("//a[contains(text(), 'Croatian')]"));
    public static final Target ADD_LANGU2 = Target.the("ingresa idioma2 del usuario")
            .located(By.xpath("//a[contains(text(), 'Turkish')]"));
    public static final Target ADD_SKILLS = Target.the("ingresa skill de usuario")
            .located(By.xpath("//option[@value='SQL']"));
    public static final Target ADD_COUNTRY = Target.the("ingresa ciudad del usuario")
            .located(By.xpath("//option[@value='India']"));
    public static final Target ADD_YEAR = Target.the("ingresa anno de nacimiento de usuario")
            .located(By.xpath("//option[@value='2000']"));
    public static final Target ADD_MONTH = Target.the("ingresa mes de nacimiento del usuario")
            .located(By.xpath("//option[@value='April']"));
    public static final Target ADD_DAY = Target.the("ingresa dia de nacimiento del usuario")
            .located(By.xpath("//option[@value='15']"));
    public static final Target ADD_PASS = Target.the("ingresa contrasena del usuario")
            .located(By.xpath("//input[@id='firstpassword']"));
    public static final Target CONF_PASS = Target.the("ingresa confirmacion de contrasena de usuario")
            .located(By.xpath("//input[@id='secondpassword']"));
    public static final Target BUTTON = Target.the("Envia los datos del formulario")
            .located(By.id("submitbtn"));
    public static final Target VER_TXT = Target.the("confirma registro del formulario")
            .located(By.xpath(""));

}
