package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import stepdefs.AbstractBaseStep;
import testPages.TercerPageObject;

public class tercero extends AbstractBaseStep
{
    TercerPageObject tercerpageobject;
    public tercero(Context context) {
        super(context);
        tercerpageobject=context.getManager().getTercerpageobject();
    }

    @And("improve a building {string}")
    public void improveABuilding(String palabra)
    {
        tercerpageobject.subirEdificio(palabra);
    }
}
