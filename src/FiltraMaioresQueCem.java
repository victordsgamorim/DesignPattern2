import java.util.ArrayList;
import java.util.List;

public class FiltraMaioresQueCem extends Filtro {

    public FiltraMaioresQueCem(Filtro filtro) {
        super(filtro);
    }

    public FiltraMaioresQueCem() {
    }

    @Override
    protected List<Conta> filtra(List<Conta> contas) {

        List<Conta> filtrados = new ArrayList<>();
        for (Conta c : contas) {
            if (c.getValor() > 100) {
                filtrados.add(c);
            }
        }
        filtrados.addAll(outroFiltro(contas));
        return filtrados;
    }
}
