package EjemploPolimorfismo;
//@author emendezduran
public class Persoa {
    
    private String nombre;
    private float sueldo;

    public Persoa(String nombre, float sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Persoa{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    

}
