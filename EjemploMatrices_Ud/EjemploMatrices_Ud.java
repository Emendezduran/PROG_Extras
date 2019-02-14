package EjemploMatrices_Ud;
//@author emendezduran
public class EjemploMatrices_Ud {

    public static void main(String[] args) {
        //1. Declaramos la matriz de tipo int
        int edades [][];
        //2.Instanciar matriz de tipo int
        edades = new int[3][2];
        //3.Instanciar valores de la matriz
        edades [0][0] = 30;
        edades [0][1] = 15;
        edades [1][0] = 20;
        edades [1][1] = 45;
        edades [2][0] = 5;
        edades [2][1] = 38;
        //4.Imprimir valores
        System.out.println("valor en el intice 0-0 " + edades[0][0]);
        
        //1. Declarar matriz de tipo object 
        Persona personas[][] = new Persona[1][2];
        //2.Asignar valores
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        //3.Imprimir Valores
        System.out.println("valor en el intice 0-0 " + personas[0][0]);
        System.out.println("valor en el intice 0-0 " + personas[0][1]);
        
        System.out.println();
        
        for (int i = 0; i < personas.length; i++) {
            for (int j = 0; j < personas[i].length; j++) {
                System.out.println("valor en el indice: " + i +"-"+ j + ": "+ personas[i][j]);
                
            }
            
        }

        
    }
        
        
}
