package State;

public class Aprovado implements DescontroExtra {


    @Override
    public double aplicaDescontoExtra(Orcamento2 orcamento) {
        return orcamento.getPreco() * 0.05;
    }

    @Override
    public void aprovado(Orcamento2 orcamento2) {
        throw new RuntimeException("Orcamento ja foi aprovado");
    }

    @Override
    public void reprovado(Orcamento2 orcamento2) {
        throw new RuntimeException("Orcamento ja foi aprovado e nao pode ser reprovado");
    }

    @Override
    public void finalizado(Orcamento2 orcamento2) {
        orcamento2.descontoExtra = new Finalizado();
    }
}
