package ejemplo_generic;
//@author emendezduran

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        /*
        ClaseObject obx1 = new ClaseObject();
        obx1.setVariable("aaaa");
        String cadea = (String) obx1.getVariable();
        System.out.println(cadea);
        Persoa p1 = new Persoa("ana", 2000);
        obx1.setVariable(p);
        Persoa per = (Persoa) obx1.getVariable();
        System.out.println(per);
         
        ClaseGenerica<String> nome = new ClaseGenerica();
        nome.setValor("SSSSS");
        String cadea2 = nome.getValor();
        System.out.println(cadea2);

        Persoa p2 = new Persoa("anton", 1000);
        ClaseGenerica<Persoa> per = new ClaseGenerica();
        */
        /*
        ArrayList <Persoa> lp = new ArrayList<>();
        lp.add(p1);
        lp.add(p2);
        per.setValor(p1);
        per.setValor(p2);
        per.visualizar(lp);
        */
        
        ClaseGenerica<Persoa> per = new ClaseGenerica();
          
        Profesor prof1 = new Profesor("nina", 1500, "PR");
        Profesor prof2 = new Profesor("manuel", 1550, "SI");
        Profesor prof3 = new Profesor("ricardo", 1350, "BD");
        ArrayList <Profesor> lprof = new ArrayList<>();
        lprof.add(prof1);
        lprof.add(prof2);
        lprof.add(prof3);
        
        per.ver(lprof);

    }

}
