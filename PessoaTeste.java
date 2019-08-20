
public class PessoaTeste {
    public static void main (String args[]) {
    float idade ;
    Pessoa p = new Pessoa ();
    p.setnome("Aline");
    p.setdtNasc("1998");
    p.setaltura(1.64f);
    p.DadosPessoa();
   idade = p.CalularIdade(1998f, 2019f);
   System.out.println ("A idade da " + p.getnome() + " é: " + idade );
  }
    }
    

