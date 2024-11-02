package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.Then;
import stepdefs.AbstractBaseStep;
import testPages.CuartoPageObject;

public class cuarto extends AbstractBaseStep
{
    CuartoPageObject cuartopageobject;
    public cuarto(Context context)
    {
        super(context);
        cuartopageobject=context.getManager().getCuartopageobject();
    }

    @Then("user select options menuTable")
    public void userSelectOptionsMenutable()
    {
        cuartopageobject.clicamosEnDesarrolloFormaDeVida();
    }
}
