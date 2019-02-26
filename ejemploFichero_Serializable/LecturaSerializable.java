package ejemploFichero_Serializable;
//@author emendezduran

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;




public class LecturaSerializable {

    ObjectInputStream ler;
    FileInputStream f;
    
    public void lerSerializado(String nombre) {
        try {
            f = new FileInputStream(nombre+".dat");
            ler = new ObjectInputStream(f);
            Alumno a1 = (Alumno)ler.readObject();
            
        } catch(ClassNotFoundException ex){
            System.out.println("ERROR: NO EXISTE LA CLASE" + ex.getMessage());
        } catch(FileNotFoundException ex){
            System.out.println("ERROR6"+ ex.getMessage());
        } catch(IOException ex){    
            System.out.println("ERROR7 " + ex.getMessage());
        } finally {
             try {
                ler.close();
                f.close();
            } catch (IOException ex) {
                System.out.println("ERROR CERRANDO" + ex.getMessage());
            }
            
        }   
    }

}
