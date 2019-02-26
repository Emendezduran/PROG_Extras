package Ejemplo_Ficheros;
//@author emendezduran

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Leer {

    public Scanner scan;

    public void leerPalabras(File fich) {
        try {
            scan = new Scanner(fich).useDelimiter("\\s*,\\s*");
            while (scan.hasNext()) {

                System.out.println(scan.next());

            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            scan.close();
        }

    }

    public ArrayList<Integer> leerNumeros(File fich, ArrayList<Integer> lista) {
        try {
            scan = new Scanner(fich).useDelimiter("\\s*,\\s*");
            while (scan.hasNext()) {
                int n = scan.nextInt();
                lista.add(n);

            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            scan.close();
        }
        return lista;

    }

    public ArrayList<Alumno> leerObjetos(File fich) {
        ArrayList<Alumno> lista = new ArrayList<>();

        try {
            scan = new Scanner(fich);
            while (scan.hasNextLine()) {
                String[] alum = scan.nextLine().split(" ");
                Alumno al = new Alumno(alum[0], Integer.parseInt(alum[1]));
                lista.add(al);
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } finally {
            scan.close();
        }
        return lista;
    }
}

