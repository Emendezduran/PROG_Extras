package PROG_APPAlmacen;
//@author emendezduran

import java.util.HashMap;

public class Productos {

    HashMap<Integer, Float> preciosProductos = new HashMap<>();

    public Productos() {
    }

    public void agregarPrecios(int ref, float precioProducto) {
        preciosProductos.put(ref, precioProducto);
    }
    
        public float getPrecio(int ref){
         return preciosProductos.get(ref);

    }
}

