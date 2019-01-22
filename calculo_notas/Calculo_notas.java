/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo_notas;

/**
 *
 * @author emendezduran
 */
public class Calculo_notas {

    public static void main(String[] args) {
    
        System.out.println("Numero de Alumnos");    
        
        
        Alumno numero1 = new Alumno();
        numero1.introducirDatos();
        System.out.println(numero1.calcularNota());
    }
          
}
