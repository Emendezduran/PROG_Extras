package ejemploFichero_Serializable;
//@author emendezduran

import Utilidades.PedirDatos;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirSerializable {

    ObjectOutputStream fich;
    FileOutputStream f;

    public void escribirObjeto(String filename) {
        try {
            f = new FileOutputStream(filename + ".dat");
            fich = new ObjectOutputStream(f);
            // fich = new ObjectOutputStream(new FileOutputStream(filename + ".dat"));

            for (int i = 0; i < 3; i++) {
                Alumno al1 = new Alumno("Alumno: " + i+1, i + 5);
                fich.writeObject(al1);
            }

        } catch (FileNotFoundException ex) {
            System.out.println("ERROR1" + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("ERROR2" + ex.getMessage());

        } finally {
            try {
                fich.close();
                f.close();
            } catch (IOException ex) {
                System.out.println("ERROR CERRANDO" + ex.getMessage());
            }

        }

    }
}
