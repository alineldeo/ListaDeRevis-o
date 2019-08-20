



public class Pessoa {
     private String nome;
    private String dtNasc;
    private float altura;
   
    public void setaltura(float altura) {
        this.altura = altura;
       
    }

    public float getaltura() {
        return (float) altura;
    }

    public void setdtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getdtNasc() {
        return dtNasc;
    }

    public void setnome(String nome) {
        this.nome = nome;
   
    }

    public String getnome() {
        return this.nome;
    }
public float CalularIdade (float anoNascimento, float anoAtual) {
	return anoAtual - anoNascimento;
}
    public void DadosPessoa() {
      System.out.println ("Nome:" + this.nome);
      System.out.println ("data de Nascimento :" + this.dtNasc);
      System.out.println ("Altura:" + this.altura);

    }

   
      
       
  }
 


    
    
    

