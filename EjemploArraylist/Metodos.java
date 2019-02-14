package EjemploArraylist;
//@author emendezduran

import Utilidades.PedirDatos;
import java.util.ArrayList;
import java.util.Iterator;

public class Metodos {

    public void añadir(ArrayList<Integer> listNumeros) {
        listNumeros.add(PedirDatos.enteiro("mensaje"));
    }

    public void mostrarFor(ArrayList<Integer> listNumeros) {
        for (int i = 0; i < listNumeros.size(); i++) {
            System.out.println(listNumeros.get(i));
        }
    }

    public void mostrarForEach(ArrayList<Integer> listNumeros) {
        for (Integer ele : listNumeros) {
            System.out.println(ele);
        }
    }

    public void mostrarIterator(ArrayList<Integer> listNumeros) {
        Iterator it = listNumeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public int borrarPosicion(ArrayList<Integer> listNumeros, int posicion) {
        return listNumeros.remove(posicion-1);
    }
    
    public void borrarElemento(ArrayList<Integer> listNumeros, Integer elemento) {
        //listNumeros.remove(new Integer(elemento);
        listNumeros.remove(elemento);
    } 
    
    public void actualizarValor(ArrayList<Integer> listNumeros, Integer pos, int novo){
        listNumeros.set(pos-1, novo);
    }
    
    
}
