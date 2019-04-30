package ejemplo_generic;
//@author emendezduran

import EjemploPolimorfismo.*;
//@author emendezduran

public class Profesor extends Persoa {

    private String modulo;

    public Profesor(String nombre, float sueldo, String modulo) {
        super(nombre, sueldo);
        modulo = this.modulo;
    }

    public void setModulo(String mo) {
        modulo = mo;
    }

    public String getModulo() {
        return modulo;
    }

    @Override
    public String toString() {
        return super.toString() + "Modulo del Profesor{ lengua" + '}';
    }

}
