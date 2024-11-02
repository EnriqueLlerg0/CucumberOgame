package stepdefs.steps;

import cucumber.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import stepdefs.AbstractBaseStep;
import testPages.SextoPageObject;

public class sexto extends AbstractBaseStep
{

    SextoPageObject sextopageobject;
    public sexto(Context context)
    {
        super(context);
        sextopageobject=context.getManager().getSextopageobject();
    }

    @And("user go to Mercado de recursos")
    public void userGoToMercadoDeRecursos()
    {
        sextopageobject.cliclamosEnLaOpcionMercadoDeRecursos();
        sextopageobject.volvemos();
    }

    @And("user go to Subastador")
    public void userGoToSubastador()
    {
        sextopageobject.cliclamosEnLaOpcionSubastador();
        sextopageobject.volvemos();
    }

    @And("user go to Chatarrero")
    public void userGoToChatarrero()
    {
        sextopageobject.cliclamosEnLaOpcionChatarrero();
        sextopageobject.volvemos();
    }

    @And("user go to ImportExport")
    public void userGoToImportExport()
    {
        sextopageobject.cliclamosEnLaOpcionImportExport();
        sextopageobject.volvemos();
    }
}
