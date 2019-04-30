package ejemplo_generic;
//@author emendezduran

import java.util.ArrayList;

public class ClaseGenerica<T> { // esto indica que es una clase parametrizada

    private T valor;

    public ClaseGenerica() {
        valor = null;
    }

    public void setValor(T v) {
        valor = v;
    }

    public T getValor() {
        return valor;
    }

    public <T> void visualizar(ArrayList<T> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public void ver(ArrayList<? extends Persoa> lisPersoa) {
        for (int i = 0; i < lisPersoa.size(); i++) {
            System.out.println(lisPersoa.get(i));
        }
    }

}


