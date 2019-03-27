package ejemploEventos2;
//@author emendezduran

import ejemploEventos.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos implements ActionListener {

    JFrame marco;
    JPanel panel;
    JButton boton;
    
    public void iniComp(){
        
        marco = new JFrame("EVENTOS");
        panel = new JPanel();
        boton = new JButton("vermello");
        marco.setSize(400, 200);
        panel.add(boton);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
        //Selecionando eventos 
        boton.addActionListener(this);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setBackground(Color.red);
    }
    
    
    
}
