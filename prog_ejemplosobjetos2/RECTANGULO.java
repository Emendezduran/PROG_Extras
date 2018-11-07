package prog_ejemplosobjetos2;

import java.util.Scanner;

public class RECTANGULO {
    
    private float base;
    private float altura;
    
    //constructores 
    
    public RECTANGULO (){
    
    }
 
    public RECTANGULO (float b, float a){
        base= b;
        altura= a;  
    }
    
    public void setBase(float b){
        base= b;
    }
    
    public float getBase(){
        return base;
    }
    
    public void setAltura(float a){
        altura= a;
    }
    
    public float getAltura(){
        return altura;
    }
    
    public float area(){
        float area;
        area= (base*altura);
        return area;
        
    }
    
    public void perimetro(){
 
    Scanner leer = new Scanner (System.in);  
    System.out.println("Teclea la base");
    float alt=leer.nextFloat();
    System.out.println("Teclea la altura");
    float bas=leer.nextFloat();
        
    float perimetro;    
           perimetro = (bas+alt)*2;
        
    System.out.println("Perimetro: "+perimetro);
            
    }
}

