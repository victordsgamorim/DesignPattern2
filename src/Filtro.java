import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

    private Filtro outroFiltro;

    public Filtro() {
    }

    public Filtro(Filtro outroFiltro) {
        this.outroFiltro = outroFiltro;
    }

    protected abstract List<Conta> filtra(List<Conta> contas);

    protected List<Conta> outroFiltro(List<Conta> contas) {
        if (outroFiltro == null) {
            return new ArrayList<Conta>();
        }
        return outroFiltro.filtra(contas);
    }
}
