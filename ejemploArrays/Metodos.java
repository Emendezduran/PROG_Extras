package ejemploArrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author emendezduran
 */
public class Metodos {
    
    int[] notas = {2,3,4,3,2,6,4,5,2,1};
    
    public int darValor(){
        return Integer.parseInt(JOptionPane.showInputDialog(this));
    }
    
    public void crearArray(){
        for(int i=0;i<notas.length;i++){
            notas[i]=darValor();
        }
    }
        
    public void amosar(){
        for(int i=0;i<notas.length;i++){
            System.out.println(notas[i]);
        }
    }
    
    public void amosarForEach(){
        for(int ele : notas)
            System.out.println(ele);
    }
    
    public int buscar(int num){
        for(int i=0;i<notas.length;i++){
            if (num == notas[i]) return i;   
        } return -1;
    }
    
    public int buscarElementoRepetido(int num){
        int cont = 0;
        for(int i=0; i<notas.length; i++){
            if (num == notas[i]) cont++;
        } return cont;
        }
    
    public int[] buscarIndices(int num) {
        int[] indice = new int[buscarElementoRepetido(num)];
        int cont = 0;
        for (int i = 0; i < notas.length; i++) {
            if (num == notas[i]) {
                indice[cont] = i;
                cont++;
            }

        } return indice;
    }

    public static int[] ordenarDirecto(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
    
    public void ordenarDirectoInterno() {
        notas=ordenarDirecto(notas);
    }

    public static int[] borrarEle(int[] array, int indice){
      int[] nuevoArray = new int[array.length-1];  
        for(int i = 0, j = 0 ; i < array.length ; i++){
        if(i!=indice){
            nuevoArray[j]=array[i];
            j++;
        } 
        } return nuevoArray;
            
    }
    
    public void eliminarElementoInterno(int indice){
        notas=borrarEle(notas, indice);
    }
    
    
    
    

}
