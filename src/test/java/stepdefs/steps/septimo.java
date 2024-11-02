package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import stepdefs.AbstractBaseStep;
import testPages.SeptimoPageObject;

public class septimo extends AbstractBaseStep
{
    SeptimoPageObject septimoPageObject;
    public septimo(Context context) {
        super(context);
        septimoPageObject=context.getManager().getSeptimopageobject();
    }

    @And("user improve {string} {string}")
    public void userImprove(String op, String string)
    {
        septimoPageObject.cliclamosEnUnaInstalacion(op, string);
    }
}
