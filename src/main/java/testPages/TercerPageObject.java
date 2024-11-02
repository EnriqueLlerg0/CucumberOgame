package testPages;

import driver.MyWebDriver;
import org.openqa.selenium.By;
import page.CommonElements.CommonElementPageObject;

public class TercerPageObject extends CommonElementPageObject
{

    public TercerPageObject(MyWebDriver driver) {
        super(driver);
    }

    public void subirEdificio(String palabra)
    {
        waiting(3);
        click(driver.getDriver().findElement(By.xpath("//button[contains(@aria-label,'"+palabra+"')]")));
    }

    public void mejorarBoton()
    {
        click(driver.getDriver().findElement(By.xpath("//span[contains(text(),'Mejorar')]")));
    }
}
