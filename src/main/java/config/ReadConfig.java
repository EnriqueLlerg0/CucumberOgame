package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig
{
    public static String devolverURL()
    {
        Properties dato=new Properties();
        FileInputStream fis=null;
        try
        {
            fis=new FileInputStream(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"configuration.properties");
            dato.load(fis);
            String url=dato.getProperty("enlacebueno");

            return url;
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static String devolverURLgoogle()
    {
        Properties dato=new Properties();
        FileInputStream fis=null;
        try
        {
            fis=new FileInputStream(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"configuration.properties");
            dato.load(fis);
            String url=dato.getProperty("google");

            return url;
        }catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
