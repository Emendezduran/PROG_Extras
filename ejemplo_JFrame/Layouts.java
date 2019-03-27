package ejemplo_JFrame;
//@author emendezduran

import java.awt.*;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts {

    JFrame marco;
    JPanel panel;
    JButton boton1, boton2, boton3, boton4, boton5;

    public void disFlowLayout() {

        marco = new JFrame();
        panel = new JPanel();
        boton1 = new JButton("boton1");
        boton2 = new JButton("boton2");
        boton3 = new JButton("boton3");
        boton4 = new JButton("boton4");
        boton5 = new JButton("boton5");

        marco.setSize(600, 300);

        FlowLayout fl = new FlowLayout(FlowLayout.RIGHT);
        panel.setLayout(fl);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);

        marco.add(panel);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);

    }

    public void iniComp() {

        marco = new JFrame();
        panel = new JPanel();
        boton1 = new JButton("boton1");
        boton2 = new JButton("boton2");
        boton3 = new JButton("boton3");
        boton4 = new JButton("boton4");
        boton5 = new JButton("boton5");
        marco.setSize(600, 300);

    }
    
    public void boxLayout(){
        
        iniComp();
        BoxLayout bl = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(bl);
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        marco.add(panel);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
    }
    
    public void borderLayout(){
        iniComp();
        BorderLayout bol = new BorderLayout();
        panel.setLayout(bol);
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.CENTER);
        panel.add(boton4, BorderLayout.WEST);
        panel.add(boton5, BorderLayout.EAST);
        marco.add(panel);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
    }

    public void gridLayout() {
        iniComp();
        GridLayout gl = new GridLayout(3, 2);
        panel.setLayout(gl);
        panel.add(boton1, BorderLayout.NORTH);
        panel.add(boton2, BorderLayout.SOUTH);
        panel.add(boton3, BorderLayout.CENTER);
        panel.add(boton4, BorderLayout.WEST);
        panel.add(boton5, BorderLayout.EAST);
        marco.add(panel);

        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);

    }
}
