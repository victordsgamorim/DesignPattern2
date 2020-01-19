import java.util.ArrayList;
import java.util.List;

public class FiltraValorMaiorQueQuinhetos extends Filtro {

    public FiltraValorMaiorQueQuinhetos(){}

    public FiltraValorMaiorQueQuinhetos(Filtro outroFiltro) {
        super(outroFiltro);
    }

    @Override
    protected List<Conta> filtra(List<Conta> contas) {
        List<Conta> filtrados = new ArrayList<>();

        for (Conta c : contas) {
            if (c.getValor() > 500) filtrados.add(c);
        }
        filtrados.addAll(outroFiltro(contas));
        return filtrados;
    }
}
