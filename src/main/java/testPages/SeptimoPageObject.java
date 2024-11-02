package testPages;

import driver.MyWebDriver;
import org.openqa.selenium.By;
import page.CommonElements.CommonElementPageObject;

public class SeptimoPageObject extends CommonElementPageObject
{
    public SeptimoPageObject(MyWebDriver driver) {
        super(driver);
    }

    public void cliclamosEnUnaInstalacion(String op, String palabra)
    {
        waiting(3);
        click(driver.getDriver().findElement(By.xpath("//button[contains(@aria-label,'"+palabra+"')]")));

    }
}
