/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_switch_case;

import java.util.Scanner;

/**
 *
 * @author emendezduran
 */
public class Ejemplo_Switch_case {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("****MENU****\n 1-> lunes\n 2-> martes\n 3-> miercoles\n 4-> jueves\n 5-> viernes\n 6-> sabado\n 7-> Domingo \n ELIGE UNA OPCION");
    
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
                                    }
    }
    
    
}
