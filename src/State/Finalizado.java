package State;

public class Finalizado implements DescontroExtra {
    @Override
    public double aplicaDescontoExtra(Orcamento2 orcamento) {
        throw new RuntimeException("Orcamento ja foi finalizado!");
    }

    @Override
    public void aprovado(Orcamento2 orcamento2) {
        throw new RuntimeException("Orcamento ja foi finalizado");
    }

    @Override
    public void reprovado(Orcamento2 orcamento2) {
        throw new RuntimeException("Orcamento ja foi finalizado");
    }

    @Override
    public void finalizado(Orcamento2 orcamento2) {
        throw new RuntimeException("Orcamento ja foi finalizado");
    }
}
