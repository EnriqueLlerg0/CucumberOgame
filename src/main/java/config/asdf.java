package config;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class asdf
{
    public static void main(String[] args) {
        try {
            JsonParser parse=new JsonParser();
            FileReader file=new FileReader(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"java"+File.separator+"JSON_file"+File.separator+"DatosUsuario.json");
            Object ob= parse.parse(file);
            JsonObject js=(JsonObject) ob;
            String usuario= js.get("usuario").getAsString();
            System.out.println("usuario: "+usuario);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
