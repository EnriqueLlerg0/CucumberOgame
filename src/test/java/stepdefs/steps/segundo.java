package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import stepdefs.AbstractBaseStep;
import testPages.SegundoPageObject;

public class segundo extends AbstractBaseStep
{
    SegundoPageObject segundoPageObject;
    public segundo(Context context) {
        super(context);
        segundoPageObject =context.getManager().getSegundopageobject();
    }

    @And("We enter each of the options {string}")
    public void weEnterEachOfTheOptions(String string)
    {
        segundoPageObject.movernosEntreLasDiferentesOpciones(string);
    }
}
