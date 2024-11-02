package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import stepdefs.AbstractBaseStep;
import testPages.QuintoPageObject;

public class quinto extends AbstractBaseStep
{
    QuintoPageObject quintopageobject;
    public quinto(Context context) {
        super(context);
        quintopageobject=context.getManager().getQuintopageobject();
    }

    @And("user improve a building {string}")
    public void userImproveABuilding(String string)
    {
        quintopageobject.subirInstalaciones(string);
    }
}
