package ejemploEventos3;
//@author emendezduran

import ejemploEventos2.*;
import ejemploEventos.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos {

    JFrame marco;
    JPanel panel;
    JButton boton;
    JButton boton2;

    public void iniComp() {

        marco = new JFrame("EVENTOS");
        panel = new JPanel();
        boton = new JButton("vermello");
        boton2 = new JButton("verde");
        marco.setSize(400, 200);
        panel.add(boton);
        panel.add(boton2);
        marco.add(panel);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.red);
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(Color.green);
            }
        });
        
    }

}
