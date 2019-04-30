package expresionesLambda;
//@author emendezduran

public class Metodos {

    public void crearLambda() {

        IOperable op1 = (double n1, double n2) -> {return (n1 + n2);};

        op1.amosar();
        System.out.println("resultado: " + op1.operacion(1.2, 2.1));

        IOperable op2 = (n1, n2) -> {return (n1 + n2);};

        op2.amosar();
        op2.operacion(3, -4);
    }

}
