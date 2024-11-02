package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.Then;
import stepdefs.AbstractBaseStep;
import testPages.DecimoPageObject;

public class decimo extends AbstractBaseStep
{
    DecimoPageObject decimopageobject;
    public decimo(Context context) {
        super(context);
        decimopageobject=context.getManager().getDecimopageobject();
    }
}
