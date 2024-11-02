package testPages;

import driver.MyWebDriver;
import org.openqa.selenium.By;
import page.CommonElements.CommonElementPageObject;

public class NovenoPageObject extends CommonElementPageObject
{
    public NovenoPageObject(MyWebDriver driver) {
        super(driver);
    }

    public void cliclamosEnUnaDeLasDefensas(String op, String cantidad)
    {
        if(op.contains("Cúpula"))
        {
            click(driver.getDriver().findElement(By.xpath("//li[@aria-label='"+op+"']")));
            click(driver.getDriver().findElement(By.xpath("//button[contains(@aria-label,'"+op+"')]")));
        }
        else
        {
            click(driver.getDriver().findElement(By.xpath("//li[@aria-label='"+op+"']")));
            waiting(3);
            escribir(driver.getDriver().findElement(By.xpath("//input[@type='text' and @name='build_amount']")),cantidad);
        }

    }
}
