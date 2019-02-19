package PROG_APPAlmacen;
//@author emendezduran

public class APP {

    public static void main(String[] args) {

        Controlador c1 = new Controlador();

        c1.agregar("mesa", 100, 214.50f);
        c1.agregar("silla", 400, 39.99f);
        c1.agregar("escritorio", 50, 159.90f);
        c1.agregar("sofa", 30, 299f);
        c1.agregar("monitor", 20, 300f);

        float totalMesas = c1.calcular("mesa");
        float totalSillas = c1.calcular("silla");
        float totalEscritorios = c1.calcular("escritorio");
        float totalSofas = c1.calcular("sofa");

        float total = totalMesas + totalSillas + totalEscritorios + totalSofas;

        // Salida por consola
        System.out.println("\n Mesas: " + totalMesas  +  "\n Sillas: " +totalSillas + "\n Escritorios: " +totalEscritorios +  "\n Sofas: " + totalSofas + "\n TOTAL ALMACENADO: " + total);
       

    }

}
