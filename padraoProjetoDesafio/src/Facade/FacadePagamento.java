package Facade;

import Strategy.StrategyPagamento;

public class FacadePagamento {
    private StrategyPagamento StrategyPagamento;

    public FacadePagamento(StrategyPagamento StrategyPagamento) {
        this.StrategyPagamento = StrategyPagamento;
    }

    public void processarPagamento(int valor) {
        StrategyPagamento.pagar(valor);
    }
}
