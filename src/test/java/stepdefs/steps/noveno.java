package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import stepdefs.AbstractBaseStep;
import testPages.NovenoPageObject;

public class noveno extends AbstractBaseStep
{
    NovenoPageObject novenopageobject;
    public noveno(Context context) {
        super(context);
        novenopageobject=context.getManager().getNovenoPageObject();
    }

    @And("user builds {string} {string}")
    public void userBuilds(String string, String cantidad)
    {
        novenopageobject.cliclamosEnUnaDeLasDefensas(string, cantidad);
    }
}
