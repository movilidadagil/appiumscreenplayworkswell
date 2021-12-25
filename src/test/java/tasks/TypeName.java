package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.remote.server.handler.SendKeys;
import user_interfaces.AppHomePage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class TypeName implements Task {


    String name="";

    protected TypeName(String name) {
        this.name = name;
    }

    @Step("{0} types a name")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AppHomePage.TYPE_NAME.resolveFor(actor).type(this.name),
                Click.on(AppHomePage.SEARCH_BTN)
        );


    }

    public static TypeName with(String name) {
        return instrumented(TypeName.class, name);
    }
}
