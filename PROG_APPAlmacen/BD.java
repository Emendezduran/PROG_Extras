package PROG_APPAlmacen;
//@author emendezduran

import java.util.HashMap;

public class BD {

    HashMap<String, Integer> listaProductos = new HashMap<>();

    public BD() {
    }

    public void agregarProductos(String nombre, int ref) {
        listaProductos.put(nombre, ref);
    }

    public boolean contiene(String nombre) {
        return listaProductos.containsKey(nombre);
    }
    
    public int getRef(String nombre){
       return listaProductos.get(nombre);      
    }
    
    Object[] nombres(){
       return listaProductos.keySet().toArray();
    }
    
}


