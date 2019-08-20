 import java.util.List;
public class Elevador {
    
    private int andar;
    private int inicializa;
    private int Entra;
    private List<Pessoa> pessoas;
    

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;

    }
    public List<Pessoa> getPessoas () {
    return pessoas;
    }

    public int getInicializa() {
        return inicializa;
    }
    public void setInicializa (int inicializa){
    this.andar = inicializa;
    }

    public void setAndar( int andar) {
        this.andar = andar;

    }

    public int getAndar() {
        return Entra;
    }

    

    public void SubirDescer() {
    
        if (inicializa> Entra) {
            System.out.println("Sobe");
        }

        else {
            System.out.println("Desce");
        }
    }
}
    
    
    
    
    

