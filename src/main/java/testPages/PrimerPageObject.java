package testPages;

import driver.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.CommonElements.CommonElementPageObject;

import java.util.List;

public class PrimerPageObject extends CommonElementPageObject
{

    public PrimerPageObject(MyWebDriver driver) {
        super(driver);
    }

    public void seleccionamosLaOpcion()
    {
        cambiarUltimaPestaña();
        click(waitForElementToBePresent(By.xpath("//span[contains(text(),'Visión general')]//ancestor::li//a[1]"), 20));
    }

    public void moverRaton()
    {
        moverRatonAPosicion(driver.getDriver().findElement(By.xpath("//div[@id='buttonz']/div/div[2]/a")));
    }

    public void acceptarPremios()
    {
        List<WebElement> lista=driver.getDriver().findElements(By.xpath("//div[@id='buttonz']/div/div[2]/div/div/div[2]/div/a[contains(text(),'Aceptar premio')]"));
        for(int i=0;i< lista.size();i++)
        {
            click(lista.get(i));
            System.out.println("pulsado");
        }
    }
}
