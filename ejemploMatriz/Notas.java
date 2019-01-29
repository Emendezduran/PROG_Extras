
package ejemploMatriz;

/**
 *
 * @author emendezduran
 */
public class Notas {
    
     int [][]notas= {{7,9,6},{3,8,9},{5,6,4}};
    
    /*public void crearTabla(){
        for(int f=0; f<notas.length;f++){
        for(int i=0; i<notas[0].length;i++){
            notas[f][c]= Integer.parseInt()
}*/
        
    public void amosar(){
        for(int f=0; f<notas.length;f++){
            System.out.print("|");
            for(int c=0; c<notas[f].length;c++){
                System.out.println(notas[f][c] +"  ");
            }
            System.out.print("|\n");    
        }
        
     
    }   
}

