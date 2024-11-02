package page.CommonElements;

import config.ReadConfig;
import driver.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import page.AbstrapPageObject.AbstrapPageObject;

import java.time.Duration;
import java.util.*;

public class CommonElementPageObject extends AbstrapPageObject
{

    /*
        //ul/li/a/span[contains(text(),'Visión general')]
        */
    //BACKGROUND
    public CommonElementPageObject(MyWebDriver driver)
    {
        super(driver);
    }

    public void navegarGoogle()
    {
        navegar(ReadConfig.devolverURLgoogle());
    }
    public void acceptarCookies()
    {
        click(driver.getDriver().findElement(By.xpath("//div[@class='QS5gu sy4vM' and contains(text(),'Aceptar todo')]")));
    }
    public void enviarTextoNavegador(String palabra)
    {
        WebElement element=driver.getDriver().findElement(By.xpath("//textarea[@class='gLFyf']"));
        escribir(element, palabra);
        waiting(2);
        click(element);
        waiting(2);
        element.sendKeys(Keys.ARROW_DOWN);
        element.sendKeys(Keys.ENTER);
    }
    public void enviarUsuario(String palabra)
    {
        waiting(3);
        click(driver.getDriver().findElement(By.xpath("//button[@class='cookiebanner5' and contains(text(),'Aceptar cookies')]")));

        waiting(3);
        click(driver.getDriver().findElement(By.xpath("//li[contains(text(),'Iniciar sesión')]")));

        waiting(3);
        escribir(driver.getDriver().findElement(By.xpath("//input[@type='email']")),devolverUsuarioJSON());
    }
    public void enviarContraseña(String palabra)
    {
        waiting(3);
        escribir(driver.getDriver().findElement(By.xpath("//input[@type='password']")),devolverContraseñaJSON());
    }
    public void elegirenlace(String palabra)
    {
        waiting(3);
        click(driver.getDriver().findElement(By.xpath("//*[contains(text(), '"+palabra+"')]")));
    }
    public void clickBotonLogin()
    {
        waiting(3);
        click(driver.getDriver().findElement(By.xpath("//button[@class='button button-primary button-lg']")));
    }
    public void clickBotonServidor()
    {
        waiting(10);
        WebElement element = waitForElementToBePresent(By.xpath("//*[contains(text(), 'Jugado por')]"),30);
        int num=0;

        while(element==null&&num++<10)
        {
            element = waitForElementToBePresent(By.xpath("//*[contains(text(), 'Jugado por')]"),30);
            System.out.println("entro");
        }
        Assert.assertNotNull(element, "No ha cargado el elemento");
        click(element);
    }
    public void seleccionamosLaOpcionDelMenu(String palabra)
    {
        cambiarUltimaPestaña();
        click(waitForElementToBePresent(By.xpath("//span[contains(text(),'"+palabra+"')]"), 20));
    }

    public WebElement waitForElementToBePresent(By element, int seg) {
        WebDriverWait wait = new WebDriverWait(this.driver.getDriver(), Duration.ofSeconds(seg) );
        WebElement el = null;

        try {
            el = (WebElement)wait.until(ExpectedConditions.presenceOfElementLocated(element));
        } catch (Exception var6) {
            el = null;
        }
        return el;
    }
}
