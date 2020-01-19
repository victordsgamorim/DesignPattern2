package State;

interface DescontroExtra {

    double aplicaDescontoExtra(Orcamento2 orcamento);

    void aprovado(Orcamento2 orcamento2);
    void reprovado(Orcamento2 orcamento2);
    void finalizado(Orcamento2 orcamento2);

}
