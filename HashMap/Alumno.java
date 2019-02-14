package HashMap;
//@author emendezduran
public class Alumno {

    private String nome;
    private int ref;
    private int nota;
    
  
    public Alumno(){
    }
    
    public Alumno(String nome, int nota){
        this.nome = nome;
        ref=Secretaria.refe;
        this.nota = nota;
        Secretaria.refe++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    

    
    
    
}
