package Strategy;

public class PagamentoCartaoCredito implements StrategyPagamento {
    private String numeroCartao;

    public PagamentoCartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void pagar(int valor) {
        System.out.println("Pago R$" + valor + " usando cartão de crédito terminado em " + numeroCartao.substring(numeroCartao.length() - 4));
    }
}
