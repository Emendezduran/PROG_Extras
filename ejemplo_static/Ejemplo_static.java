
package ejemplo_static;

public class Ejemplo_static {

    public static void main(String[] args) {
        
        Alumno alum1 = new Alumno("Ana",5f);
        alum1.Mostrar();
        
        Alumno alum2 = new Alumno("Pepe",4f);
        alum2.Mostrar();
            
        Alumno alum3 = new Alumno("Juana",5f);
        alum3.Mostrar();
        
        Alumno alum4 = new Alumno("Pino",4f);
        alum4.Mostrar();

        System.out.println("referencia : "+ Alumno.referencia);
        
    }
}
