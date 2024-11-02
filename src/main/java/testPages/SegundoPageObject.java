package testPages;

import driver.MyWebDriver;
import org.openqa.selenium.By;
import page.CommonElements.CommonElementPageObject;

public class SegundoPageObject extends CommonElementPageObject
{
    public SegundoPageObject(MyWebDriver driver)
    {
        super(driver);
    }


    public void movernosEntreLasDiferentesOpciones(String palabra)
    {
        waiting(3);
        click(driver.getDriver().findElement(By.xpath("//h3[text()='Edificio']//parent::div//following-sibling::div//a")));
        waiting(3);
        click(driver.getDriver().findElement(By.xpath("//button[contains(@aria-label,'"+palabra+"')]")));
    }
}
