package ejemplo_JFrame;
//@author emendezduran

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana1 {

    JFrame marco;
    JDialog ventanaSecundaria;
    JPanel panel;
       
    public void crearVentana() {
        
        //Creacion de la ventana
        marco = new JFrame("titulo de la ventana");
        //Dar visibilidad
        marco.setVisible(true);
        //Modificamos el tamaño
        marco.setBounds(500, 300, 400, 400);
        //Para finalizar haciendo click en X
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Restringir la redimension
        //marco.setResizable(false);
        //Activar el maximizado a pantalla completa
        marco.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //Crear ventana Secundaria
        ventanaSecundaria = new JDialog(marco, "titulo ventana secundaria");
        ventanaSecundaria.setVisible(true);
        ventanaSecundaria.setBounds(500, 400, 400, 200);
        
        //crear un panel
        panel = new JPanel();
        panel.setBackground(Color.yellow);
        marco.add(panel);

    }

}
