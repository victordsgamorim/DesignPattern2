package State;

public class Reprovado implements DescontroExtra {
    @Override
    public double aplicaDescontoExtra(Orcamento2 orcamento) {
        throw new RuntimeException("Orcamento reprovado nao da desconto!");

    }

    @Override
    public void aprovado(Orcamento2 orcamento2) {
        throw new RuntimeException("Orcamento foi reprovado e nao pode ser aprovado");
    }

    @Override
    public void reprovado(Orcamento2 orcamento2) {
        throw new RuntimeException("Orcamento ja foi reprovado");
    }

    @Override
    public void finalizado(Orcamento2 orcamento2) {
        orcamento2.descontoExtra = new Finalizado();
    }
}
