import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {


        List<Conta> contas = new ArrayList<>();

        Conta c1 = new Conta();
        c1.setValor(50);

        Conta c2 = new Conta();
        c2.setValor(116);

        Conta c3 = new Conta();
        c3.setValor(550);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        Filtro filtro = new FiltraMaioresQueCem(new FiltraValorMaiorQueQuinhetos());

        List<Conta> filtra = filtro.filtra(contas);

        for (Conta f : filtra) {
            System.out.println(f);
        }



    }
}
