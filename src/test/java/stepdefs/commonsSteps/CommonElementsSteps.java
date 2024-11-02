package stepdefs.commonsSteps;

import config.ReadConfig;
import cucumber.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CommonElements.CommonElementPageObject;
import stepdefs.AbstractBaseStep;

public class CommonElementsSteps extends AbstractBaseStep
{
    private CommonElementPageObject commonelementpageobject;

    public CommonElementsSteps(Context context)
    {
        super(context);
        commonelementpageobject=context.getManager().getCommonElementPageObject();
    }

    @Given("user navigates to google")
    public void userNavigatesToGoogle()
    {
        commonelementpageobject.navegarGoogle();
    }

    @When("user accept the cookies")
    public void userAcceptTheCookies()
    {
        commonelementpageobject.acceptarCookies();
    }

    @Then("user navigates to the page {string} {string}")
    public void userNavigatesToThePage(String string, String palabra)
    {
        commonelementpageobject.enviarTextoNavegador(palabra);
        commonelementpageobject.elegirenlace(string);
    }

    @Then("user enters his username {string}")
    public void userEntersHisUsername(String string)
    {
        commonelementpageobject.enviarUsuario(string);
    }

    @And("user enters his password {string}")
    public void userEntersHisPassword(String string)
    {
        commonelementpageobject.enviarContraseña(string);
    }

    @And("user clicks on the login button")
    public void userClicksOnTheButton()
    {
        commonelementpageobject.clickBotonLogin();
    }

    @And("user clicks on the button to access the game")
    public void userClicksOnTheButtonToAccessTheGame()
    {
        commonelementpageobject.clickBotonServidor();
    }

    @Then("user select options {string}")
    public void userSelectOptions(String string)
    {
        commonelementpageobject.seleccionamosLaOpcionDelMenu(string);
    }
}
