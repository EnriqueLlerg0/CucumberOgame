package testPages;

import driver.MyWebDriver;
import org.openqa.selenium.By;
import page.CommonElements.CommonElementPageObject;

public class QuintoPageObject extends CommonElementPageObject
{

    public QuintoPageObject(MyWebDriver driver) {
        super(driver);
    }
    public void subirInstalaciones(String palabra)
    {
        click(driver.getDriver().findElement(By.xpath("//button[contains(@aria-label,'"+palabra+"')]")));
    }
}
