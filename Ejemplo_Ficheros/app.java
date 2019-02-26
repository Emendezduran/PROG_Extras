package Ejemplo_Ficheros;
//@author emendezduran

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class app {

    public static void main(String[] args) {

        File f1 = new File("/home/local/DANIELCASTELAO/emendezduran/Escritorio/Nombres.txt");

        Leer obx = new Leer();
        
        obx.leerPalabras(f1);
        
        File f2 = new File("/home/local/DANIELCASTELAO/emendezduran/Escritorio/Numeros.txt");
        
        ArrayList<Integer> l = new ArrayList<>();
        
        l = obx.leerNumeros(f2, l);
        
        File f3 = new File("/home/local/DANIELCASTELAO/emendezduran/Escritorio/Alumnos.txt");
        
        Iterator<Alumno> i = obx.leerObjetos(f3).iterator();
        while(i.hasNext()){
        System.out.println(i.next());
        }

    }

}
