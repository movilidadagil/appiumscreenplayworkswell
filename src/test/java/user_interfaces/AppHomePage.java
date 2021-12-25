package user_interfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AppHomePage {

    public static final Target HOME_SCREEN =
            Target.the("Home Screen").located(By.id("home_omdb"));
    public static final Target TYPE_NAME =
            Target.the("Type name").located(By.id("search_title"));
    public static final Target SEARCH_BTN =
            Target.the("Search Btn").located(By.id("search"));

}
