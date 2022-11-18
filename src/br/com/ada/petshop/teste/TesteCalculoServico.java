package br.com.ada.petshop.teste;

import br.com.ada.petshop.businessobject.*;
import br.com.ada.petshop.enumeracao.TipoPagamentoEnum;
import br.com.ada.petshop.enumeracao.TipoServicoEnum;
import br.com.ada.petshop.modelo.Pagamento;
import br.com.ada.petshop.modelo.Servico;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class TesteCalculoServico {

    public static void main(String[] args) {
        Servico tosa = new Servico();
        tosa.setValor(new BigDecimal(100.00));
        tosa.setTipoServico(TipoServicoEnum.TOSA);

        Servico banho = new Servico();
        banho.setValor(new BigDecimal(50.00));
        banho.setTipoServico(TipoServicoEnum.BANHO);

        Servico banho2 = new Servico();
        banho2.setValor(new BigDecimal(50.00));
        banho2.setTipoServico(TipoServicoEnum.BANHO);

        Servico banho3 = new Servico();
        banho3.setValor(new BigDecimal(60.00));
        banho3.setTipoServico(TipoServicoEnum.BANHO);

        CalculadoraDescontoPrecoServico calc = new CalculadoraDescontoPrecoServico();

        System.out.println("Valor anterior tosa: "+getValorFormatado(tosa.getValor()));
        DescontoCredito descontoCredito = new DescontoCredito();
        calc.aplicaDesconto(tosa, descontoCredito);
        System.out.println("Valor do tosa com desconto: "+getValorFormatado(tosa.getValor()));

        System.out.println("Valor anterior banho: "+getValorFormatado(banho.getValor()));
        DescontoDebito descontoDebito = new DescontoDebito();
        calc.aplicaDesconto(banho, descontoDebito);
        System.out.println("Valor do banho com desconto: "+ getValorFormatado(banho.getValor()));

        System.out.println("Valor anterior banho: "+getValorFormatado(banho2.getValor()));
        DescontoPix descontoPix = new DescontoPix();
        calc.aplicaDesconto(banho2, descontoPix);
        System.out.println("Valor do banho com desconto com pix: "+ getValorFormatado(banho2.getValor()));

        System.out.println("Valor anterior banho: "+getValorFormatado(banho3.getValor()));
        DescontoTED descontoTED = new DescontoTED();
        calc.aplicaDesconto(banho3, descontoTED);
        System.out.println("Valor do banho com desconto com TED: "+ getValorFormatado(banho3.getValor()));
    }

    private static String getValorFormatado(BigDecimal valor){
        String valorFormatado = NumberFormat
                .getCurrencyInstance(new Locale("pt", "br"))
                .format(valor);

        return valorFormatado;
    }
}
