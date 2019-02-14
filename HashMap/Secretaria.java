package HashMap;
//@author emendezduran

import Utilidades.PedirDatos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import javax.swing.JOptionPane;

public class Secretaria {

    public static int refe = 6000;
    
    public void crear(HashMap <String,Alumno> alum, String dni){
        if(alum.containsKey(dni))
            JOptionPane.showMessageDialog(null, "ya existe la clave");
        else
            alum.put(dni, new Alumno(PedirDatos.cadenaTexto("nombre"), PedirDatos.enteiro("nota")));
    }
    
        public void amosar(HashMap<String,Alumno>alum){
        Iterator it = alum.keySet().iterator();
            while(it.hasNext())
                System.out.println(alum.get(it.next()));
    }
       
        public void valorLista(HashMap<String,Alumno> alum){
        ArrayList<Alumno> al = new ArrayList<>();
        al.addAll(alum.values());
            for (Alumno a1:al)
                System.out.println(a1);
        } 
        
        public void eliminar(HashMap <String,Alumno> alum, String dni){
            if(!alum.containsKey(dni))
                JOptionPane.showMessageDialog(null, "No se encontro el DNI");
            else
                alum.remove(dni);
        }
        
        public void modificarDato (HashMap <String,Alumno> alum, String dni, int nota){
            alum.get(dni).setNota(nota);
                
        }
        
        public void consulta (HashMap <String,Alumno> alum, String dni){
            if(!alum.containsKey(dni))
               JOptionPane.showMessageDialog(null, "No se encontro el DNI");
            else{

                System.out.printf("nombre:%s nota:%d",alum.get(dni).getNome(), alum.get(dni).getNota());
            }
                
        }
        
}
