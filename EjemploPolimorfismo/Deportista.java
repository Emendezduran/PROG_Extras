package EjemploPolimorfismo;
//@author emendezduran
public class Deportista extends Persoa {

    public Deportista(String nombre, float sueldo) {
        super(nombre, sueldo);
    }



    @Override
    public String toString() {
        return super.toString() + "Deporte{ Natacion" + '}';
    }
    
    

}
