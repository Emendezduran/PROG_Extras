
package exemplooperadores;

public class ExemploOperadores {

    public static void main(String[] args) {
        
        int num1=0,num2 = 4;
        System.out.println("num1 = "+num1 +"\nnum2 = "+ num2);
        num1=num2++;
          System.out.println("(num1=num2++)"+num1 + "+num1" +"\nnum2 = "+ num2);
          num1=++num2;
        System.out.println("(num1=++num2)"+num1 + "+num1" + "\nnum2");
    }
    
}
