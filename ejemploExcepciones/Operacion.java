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
public class Operacion {

    public void sumar(int num1, int num2) {
        System.out.println("Suma " + num1 + "+" + num2 + "=" + (num1 + num2));
    }

    public void dividirCondicionales(int num1, int num2) {
        if(num2 != 0){
        System.out.println("Cociente " + num1 + "/" + num2 + "=" + (num1 / num2));
        } else {
        System.out.println("NO SE PUEDE DIVIDIR ENTRE 0");
        }
    }
        
    public void dividirExcepciones(int num1, int num2) {
        System.out.println("Antes de la excepcion");
        try {
            System.out.println("Cociente " + num1 + "/" + num2 + "=" + (num1 / num2));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        System.out.println("Despues de la excepcion");
    }

     public void dividirLanzandoExcepcion(int num1, int num2)throws ArithmeticException{

        if(num2 == 0){
            //ArithmeticException obx = new ArithmeticException("no / entre 0");
            //throw obx;
            throw new ArithmeticException("no / entre 0");
        } else    
        System.out.println("Cociente " + num1 + "/" + num2 + "=" + (num1 / num2));
        
    }
     
     public void dividirLanzandoNuestraExcepcion(int num1, int num2)throws DividirExcepcion,IntervaloExcepcion {

        if(num2 == 0){
            throw new DividirExcepcion("no / entre 0");
        } else if(num1>=80 && num1<=100){
            throw new IntervaloExcepcion("numero no permitido");
        }// else if (num1)  
        System.out.println("Cociente " + num1 + "/" + num2 + "=" + (num1 / num2));
        
    }
     
    public void restar(int num1, int num2) {
        System.out.println("Resta " + num1 + "-" + num2 + "=" + (num1 - num2));
    }

    public void operaciones(int num1, int num2) {
        System.out.println("Suma " + num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println("Cociente " + num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println("NO SE PUEDE DIVIDIR ENTRE 0");
        System.out.println("Resta " + num1 + "+" + num2 + "=" + (num1 + num2));
    }
}
