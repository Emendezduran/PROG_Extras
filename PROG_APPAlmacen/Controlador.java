package PROG_APPAlmacen;
//@author emendezduran

public class Controlador {

    BD bd = new BD();
    Almacen almacen = new Almacen();
    Productos producto = new Productos();

    static int cod = 1000;

    public void agregar(String nombre, int unidades, float PrecioNuevo) {
        if (!bd.contiene(nombre)) {
            int ref = cod;
            bd.agregarProductos(nombre, ref);
            almacen.agregarUnidades(ref, unidades);
            producto.agregarPrecios(ref, PrecioNuevo);
            cod += 10;

        } else {
            bd.getRef(nombre);
            
            almacen.productosAlmacenados.replace(bd.getRef(nombre), almacen.getUnidades(bd.getRef(nombre)), (almacen.getUnidades(bd.getRef(nombre)) + unidades));
            producto.preciosProductos.replace(bd.getRef(nombre), producto.getPrecio(bd.getRef(nombre)), producto.getPrecio(bd.getRef(nombre)) + PrecioNuevo);
        }

    }
    
    public void imprimir(){
       Object[] r =  bd.nombres(); 
        for (int i = 0; i < r.length; i++) {
            Object object = r[i];
            System.out.println("Nombre: " + r[i] + "Ref: " + (String) bd.getRef(r[i]));
        }
    }
    
    public float calcular(String nombre){
         return (almacen.getUnidades(bd.getRef(nombre)) * producto.getPrecio(bd.getRef(nombre)));   
         
    } 
    
    

}
