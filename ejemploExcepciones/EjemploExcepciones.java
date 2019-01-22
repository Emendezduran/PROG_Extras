/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploExcepciones;

/**
 *
 * @author emendezduran
 */
public class EjemploExcepciones {
    
    public static void main(String[] args) {
        
    
    Operacion obx = new Operacion();
    
//    obx.sumar(8, 2);
//    obx.dividirExcepciones(8, 2);
//    obx.restar(8, 2);
    
//    obx.sumar(8, 0);
//    obx.dividirExcepciones(8, 0);
//    obx.restar(8, 0);

    try{
        obx.dividirExcepciones(8, 0);
    } catch (ArithmeticException ex){
        System.out.println(ex.getMessage());
    }

            
    }       
}
    
/* Una excepcion señala situaciones anomalas y poco habituales en la ejecucion de un programa.
EJM: cuando dividimos un numero entero entre 0 saltaria una excepcion de tipo AricmeticException. 
esta situacion la podemos soventar utilizando un condicional
si utilizamos el mecanismo de excepciones de java en lugar de utilizar una serie de instrucciones condicionales, 
escribimos el programa sin tener en cuenta la situacion excepcional y despues escribimos el codigo que se ejecutaria,
de producirse la excepcion.
De esta manera podemos separar la logica del programa y las instrucciones de control de errores haciendo la
aplicacion mas flexible y robusta. 
Las excepciones son objetos que se crean en una situacion anomala y guardan informacion de esa situacion.

*/