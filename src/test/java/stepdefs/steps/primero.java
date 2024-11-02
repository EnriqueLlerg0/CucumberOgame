package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepdefs.AbstractBaseStep;
import testPages.PrimerPageObject;

public class primero extends AbstractBaseStep
{
    PrimerPageObject primerPageObject;

    public primero(Context context)
    {
        super(context);
        primerPageObject=context.getManager().getPrimeropageobject();
    }

    @Then("user select options")
    public void userSelectOptions()
    {
        primerPageObject.seleccionamosLaOpcion();
    }
    @And("We inspect the content of the icon with a question mark")
    public void weInspectTheContentOfTheIconWithAQuestionMark()
    {
        primerPageObject.moverRaton();
    }
    @And("We claim the reward")
    public void weClaimTheReward()
    {
        primerPageObject.acceptarPremios();
    }
}
