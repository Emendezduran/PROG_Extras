package EjemploArraylist;
//@author emendezduran

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) {

        Metodos obx = new Metodos();

        /*ArrayList lista = new ArrayList();
    lista.add("aaaaa");
    lista.add(new Integer(2));
    lista.add(4);
    for(int i = 0; i< lista.size();i++){
        System.out.println(lista.get(i));
        }*/
        ArrayList<Integer> lista = new ArrayList<>();
        int opcion;

        do {
            System.out.println("****MENU*****\n1->añadir elemento\n" + "2->mostrar elemento");
            opcion = Integer.parseInt(JOptionPane.showInputDialog("teclea opcion:"));
            switch (opcion) {
                case 1:
                    obx.añadir(lista);
                    break;
                case 2:
                    obx.mostrarFor(lista);
                    System.out.println("Con forEach");
                    obx.mostrarForEach(lista);
                    System.out.println("Con Iterator");
                    obx.mostrarIterator(lista);
                    break;
                case 3:
                    int posicion = Integer.parseInt(JOptionPane.showInputDialog("Posicion a borrar"));
                    obx.borrarPosicion(lista, posicion);
                    break;
                case 4:
                    obx.borrarElemento(lista, 4);
                    break;
                case 5:
                    obx.actualizarValor(lista, 2, 10);
                    break;
                case 6:
                    System.exit(0);
                default: System.out.println("Teclea una opcion entre 1 y 5 para ejecutar y 6 para salir");
            }

        } while (opcion < 5);

    }
}
