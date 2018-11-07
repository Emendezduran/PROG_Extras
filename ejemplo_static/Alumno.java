package ejemplo_static;

/**
 *
 * @author emendezduran
 */
public class Alumno {
    //Variables de clase
    private String nome;
    private float nota;
    private int numReferencia; //variable de instancia
    public static int referencia = 6220; //variable de clase
    
        //Constructor vacio
        public Alumno(){
          numReferencia = ++ referencia; //tambien vale referencia + 1
            
        }

        
        //Constructor con parametros (y variable de clase statica)
        public Alumno(String nome, float nota){
           
            this.nome = nome;
            this.nota = nota;
            numReferencia = ++ referencia;
        } 
        
            //Set&get
            /*public void setNumReferencia(int refe){
                
                numReferencia=refe;
            }

            public int getNumReferencia(){
                
                return numReferencia;
            }*/
            
            // Amosar!!! :D 
            public void Mostrar(){
                
                System.out.println("nome: " + nome+  " nota: " + nota + "Numero de Referencia: " + numReferencia);
            }
}            

/*notas: 
Una variable de tipo estatico (static) es una variable comun a todos los objetos de una misma clase
private static int numReferencia;

para llamar una variable de clase desde otra clase: nombreClase.nombreVariableStatic

Metodos estaticos: metodo general para toda la clase, solo puede acceder a variables estaticas.
Metodo no estatico: puede acceder a variables estaticas y no estaticas 

*/