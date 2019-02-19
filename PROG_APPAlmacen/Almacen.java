package PROG_APPAlmacen;
//@author emendezduran

import java.util.HashMap;

public class Almacen {

    HashMap<Integer, Integer> productosAlmacenados = new HashMap<>();

    public Almacen() {
    }

    public void agregarUnidades(int ref, int unidades) {
        productosAlmacenados.put(ref, unidades);
    }
    
    public int getUnidades(int ref){
         return productosAlmacenados.get(ref);
        
    }
}
    
