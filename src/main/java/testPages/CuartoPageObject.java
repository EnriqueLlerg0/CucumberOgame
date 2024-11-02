package testPages;

import driver.MyWebDriver;
import page.CommonElements.CommonElementPageObject;

public class CuartoPageObject extends CommonElementPageObject
{

    public CuartoPageObject(MyWebDriver driver) {
        super(driver);
    }

    public void clicamosEnDesarrolloFormaDeVida()
    {
        selecionarPestañaPorId();
    }
}
