package page.AbstrapPageObject;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import driver.MyWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.io.*;
import java.util.*;

public abstract class AbstrapPageObject
{
    protected final MyWebDriver driver;

    protected AbstrapPageObject(MyWebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(this.driver.getDriver(),this);
    }

    public void navegar(String url)
    {
        driver.getDriver().get(url);
    }



    public void click(WebElement element)
    {
        element.click();
    }
    public void escribir(WebElement element, String palabra)
    {
        element.sendKeys(palabra);
    }
    public void moverRatonAPosicion(WebElement element)
    {
        Actions action=new Actions(driver.getDriver());
        action.moveToElement(element).perform();
        waiting(3);
    }
    public void cambiarUltimaPestaña()
    {
        Set<String> elements = driver.getDriver().getWindowHandles();
        Iterator<String> iterator=elements.iterator();
        List<String> winIndex = new ArrayList<String>();
        while (iterator.hasNext()) {

            winIndex.add(iterator.next());
        }
        driver.getDriver().switchTo().window(winIndex.get(1));
    }
    public void selecionarPestañaPorId()
    {
        cambiarUltimaPestaña();
        waiting(3);
        click(driver.getDriver().findElement(By.xpath("//span[text()='Forma de vida']//parent::a/preceding-sibling::span/a")));
    }
    public void waiting(int num)
    {
        try {
            Thread.sleep(num*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String devolverUsuarioJSON()
    {
        String usuario;
        try {
            JsonParser parse=new JsonParser();
            FileReader file=new FileReader(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"JSON_file"+File.separator+"DatosUsuario.json");
            Object ob= parse.parse(file);
            JsonObject js=(JsonObject) ob;
            usuario= js.get("usuario").getAsString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return usuario;
    }
    public String devolverContraseñaJSON()
    {
        String contra;
        try {
            JsonParser parse=new JsonParser();
            FileReader file=new FileReader(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"JSON_file"+File.separator+"DatosUsuario.json");
            Object ob= parse.parse(file);
            JsonObject js=(JsonObject) ob;
            contra= js.get("contraseña").getAsString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return contra;
    }
}
