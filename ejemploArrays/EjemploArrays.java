package ejemploArrays;

import java.util.Arrays;

/**
 *
 * @author emendezduran
 */
public class EjemploArrays {

    public static void main(String[] args) {
    
        
        Metodos obx = new Metodos();
        
        //obx.crearArray();
        //obx.amosar();
        //obx.amosarForEach();
        // System.out.println(obx.buscarElementoRepetido(2));
        //System.out.println(Arrays.toString(obx.buscarIndices(2)));
        //int[] a=obx.buscarIndices(2);
        /*for(int i =0; i<a.length; i++){
            System.out.println(a[i]+" "+obx.notas[a[i]]);
        }*/
        
        //System.out.println(Arrays.toString(Metodos.ordenarDirecto(obx.notas)));
        
        /*System.out.println(Arrays.toString(obx.notas));
        Arrays.sort(obx.notas);
        System.out.println(Arrays.toString(obx.notas));*/
       
        System.out.println(Arrays.toString(obx.notas));
        System.out.println(Arrays.toString(Metodos.borrarEle(obx.notas, 5)));

}
}
