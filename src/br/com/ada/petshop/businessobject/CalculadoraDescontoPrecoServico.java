package br.com.ada.petshop.businessobject;

import br.com.ada.petshop.enumeracao.TipoPagamentoEnum;
import br.com.ada.petshop.modelo.Pagamento;
import br.com.ada.petshop.modelo.Servico;

import java.math.BigDecimal;

public class CalculadoraDescontoPrecoServico {

    // sempre que uma nova foram de pagamento for criada, teremos que adiconar um novo if
    // nossa classe estará aberta para alterações
    // podendo gerar bugs ao sofrer alterações
    // Podemos aplicar o O do SOLID?
    // O - OCP - Open-Closed Principle - Principio aberto e fechado?
    /*public void aplicaDesconto(Servico servico, Pagamento pagamento){

        if (TipoPagamentoEnum.CREDITO.equals(pagamento.getTipoPagamento())){
            //se for credito, desconto de R$ 1.00
            BigDecimal valorComDesconto = servico.getValor().subtract(new BigDecimal(1.0));
            servico.setValor(valorComDesconto);

        } else if (TipoPagamentoEnum.DEBITO.equals(pagamento.getTipoPagamento())){
            //se for debito, desconto de R$ 10.00
            BigDecimal valorComDesconto = servico.getValor().subtract(new BigDecimal(10.0));
            servico.setValor(valorComDesconto);
        }
    }*/

    public void aplicaDesconto(Servico servico, AplicadorDesconto aplicadorDesconto){
        aplicadorDesconto.aplicaDesconto(servico);
    }
}
