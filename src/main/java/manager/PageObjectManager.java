package manager;

import driver.MyWebDriver;
import page.CommonElements.CommonElementPageObject;
import testPages.*;

public class PageObjectManager
{
    private MyWebDriver driver;
    PrimerPageObject primeropageobject;
    SegundoPageObject segundopageobject;
    TercerPageObject tercerpageobject;
    CuartoPageObject cuartopageobject;
    QuintoPageObject quintopageobject;
    SextoPageObject sextopageobject;
    SeptimoPageObject septimopageobject;
    OctavoPageObject octavopageobject;
    NovenoPageObject novenopageobject;
    DecimoPageObject decimopageobject;
    public PageObjectManager(MyWebDriver driver)
    {
        this.driver=driver;
    }
    CommonElementPageObject commonElementPageObject;
    public CommonElementPageObject getCommonElementPageObject()
    {
        return (commonElementPageObject==null)?commonElementPageObject=new CommonElementPageObject(driver):commonElementPageObject;
    }
    public PrimerPageObject getPrimeropageobject()
    {
        return (primeropageobject==null)?primeropageobject=new PrimerPageObject(driver):primeropageobject;
    }
    public SegundoPageObject getSegundopageobject()
    {
        return (segundopageobject==null)?segundopageobject=new SegundoPageObject(driver):segundopageobject;
    }
    public TercerPageObject getTercerpageobject()
    {
        return (tercerpageobject==null)?tercerpageobject=new TercerPageObject(driver):tercerpageobject;
    }
    public CuartoPageObject getCuartopageobject()
    {
        return (cuartopageobject==null)?cuartopageobject=new CuartoPageObject(driver):cuartopageobject;
    }
    public QuintoPageObject getQuintopageobject()
    {
        return (quintopageobject==null)?quintopageobject=new QuintoPageObject(driver):quintopageobject;
    }
    public SextoPageObject getSextopageobject()
    {
        return (sextopageobject==null)?sextopageobject=new SextoPageObject(driver):sextopageobject;
    }

    public SeptimoPageObject getSeptimopageobject()
    {
        return (septimopageobject==null)?septimopageobject=new SeptimoPageObject(driver):septimopageobject;
    }

    public OctavoPageObject getOctavopageobject()
    {
        return (octavopageobject==null)?octavopageobject=new OctavoPageObject(driver):octavopageobject;
    }

    public NovenoPageObject getNovenoPageObject()
    {
        return (novenopageobject==null)?novenopageobject=new NovenoPageObject(driver):novenopageobject;
    }

    public DecimoPageObject getDecimopageobject()
    {
        return (decimopageobject==null)?decimopageobject=new DecimoPageObject(driver):decimopageobject;
    }
}
