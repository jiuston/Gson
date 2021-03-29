import com.google.gson.Gson;
import model.Persona;

import java.io.*;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
       Persona persona= new Persona("3333", "Miguel", "Rodriguez");
        Gson gson = new Gson();
        String personJSON = gson.toJson(persona);
        System.out.println(personJSON);
        try {
            PrintWriter printWriter= new PrintWriter(new FileWriter("listaPersonas.json"),true);
            printWriter.println(personJSON);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //FROM JSON TO JAVA
        /*String personJSON = "{\"dni\":\"22222\",\"nombre\":\"Miguel\",\"apellido\":\"Rodriguez\"}";
        Gson gson=new Gson();
        Persona persona = gson.fromJson(personJSON, Persona.class);
        System.out.println(persona.getDni());*/

        /*try {
            BufferedReader br = new BufferedReader(new FileReader("listaPersonas.json"));
            String linea;
            while ((linea = br.readLine())!=null){
               Persona person = gson.fromJson(linea, Persona.class);
               System.out.println(person.getDni());
            }
        }catch (Exception e){

        }*/

    }
}
