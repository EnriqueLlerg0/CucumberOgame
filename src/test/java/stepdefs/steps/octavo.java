package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import stepdefs.AbstractBaseStep;
import testPages.OctavoPageObject;

public class octavo extends AbstractBaseStep
{
    OctavoPageObject octavopageobject;
    public octavo(Context context) {
        super(context);
        octavopageobject=context.getManager().getOctavopageobject();
    }

    @And("user builds a {string} {string} {string}")
    public void userBuildsA (String op, String string, String cantidad)
    {
        octavopageobject.cliclamosEnUnaNave(op, string, cantidad);
    }
}
