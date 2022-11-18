package br.com.ada.petshop.modelo;

import br.com.ada.petshop.enumeracao.TipoPagamentoEnum;

public class Pagamento {

    private TipoPagamentoEnum tipoPagamento;

    public TipoPagamentoEnum getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamentoEnum tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
