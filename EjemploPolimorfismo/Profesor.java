package EjemploPolimorfismo;
//@author emendezduran
public class Profesor extends Persoa {

    public Profesor(String nombre, float sueldo) {
        super(nombre, sueldo);
    }

    @Override
    public String toString() {
        return super.toString() + "Modulo del Profesor{ lengua" + '}';
    }

    
}
