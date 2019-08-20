    import java.util.ArrayList;
import java.util.List;
    import java.util.Scanner;


public class ElevadorTeste {
public static void main(String[] args) {
    Scanner c1 = new Scanner (System.in);
    Elevador e1  = new Elevador();
  int quantidadeAndar  = 20;
    int andar = 5;   
   
   
    List<Pessoa> pessoas = new ArrayList<Pessoa>();
    e1.setPessoas(pessoas);
    e1.setAndar(andar);
    System.out.println(e1.getInicializa());
    System.out.println(e1.getAndar());
    System.out.println(e1.getPessoas());
}

}
    

