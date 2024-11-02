package testPages;

import driver.MyWebDriver;
import org.openqa.selenium.By;
import page.CommonElements.CommonElementPageObject;

public class OctavoPageObject extends CommonElementPageObject
{
    public OctavoPageObject(MyWebDriver driver) {
        super(driver);
    }

    public void cliclamosEnUnaNave(String op, String palabra, String cantidad)
    {
        click(driver.getDriver().findElement(By.xpath("//li[@aria-label='"+palabra+"']")));
        waiting(3);
        escribir(driver.getDriver().findElement(By.xpath("//input[@type='text' and @name='build_amount']")),cantidad);

    }
}
