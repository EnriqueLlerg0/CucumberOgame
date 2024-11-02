package testPages;

import driver.MyWebDriver;
import org.openqa.selenium.By;
import page.CommonElements.CommonElementPageObject;

public class SextoPageObject extends CommonElementPageObject
{

    public SextoPageObject(MyWebDriver driver) {
        super(driver);
    }

    public void cliclamosEnLaOpcionMercadoDeRecursos()
    {
        waiting(1);
        click(driver.getDriver().findElement(By.xpath("//div[@id='js_traderResources']")));
    }
    public void cliclamosEnLaOpcionSubastador()
    {
        waiting(1);
        click(driver.getDriver().findElement(By.xpath("//div[@id='js_traderAuctioneer']")));
    }
    public void cliclamosEnLaOpcionChatarrero()
    {
        waiting(1);
        click(driver.getDriver().findElement(By.xpath("//div[@id='js_traderScrap']")));
    }
    public void cliclamosEnLaOpcionImportExport()
    {
        waiting(1);
        click(driver.getDriver().findElement(By.xpath("//div[@id='js_traderImportExport']")));
    }
    public void volvemos()
    {
        waiting(1);
        click(driver.getDriver().findElement(By.xpath("//div[@id='header_text']/a")));
    }
}
