package ejemploif;

import javax.swing.JOptionPane;

public class EjemploIf {

    public static void main(String[] args) {

        String numero1 = JOptionPane.showInputDialog("teclea numero1:");
        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("teclea numero2"));
        if (num1 > num2) {
            System.out.println(num1 + " es mayor");
        } else if (num1 < num2) {
            System.out.println(num2 + " es mayor");
        } else {
           JOptionPane.showMessageDialog(null, "es igual ");
        }

    }

}
    

