package clasesanonimas;
// @author emendezduran

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ClasesAnonimas {
    JPanel panel;
    JFrame marco;
    JButton boton;

    
    public ClasesAnonimas(){
    marco = new JFrame();
    panel = new JPanel();
    boton = new JButton("Poner Color");
    marco.setSize(500, 200);
    panel.add(boton);
    marco.add(panel);
    //Embutimos la clase anonima
    boton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.red);
            Toolkit.getDefaultToolkit().beep();
        }
    });
    
    marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    marco.setVisible(true);
    }
}

    


