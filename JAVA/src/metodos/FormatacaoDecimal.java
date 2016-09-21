package metodos;

import java.text.DecimalFormat;

public class FormatacaoDecimal {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        int idade = 16;
        df.applyPattern("##0");
        System.out.println("Idade      : " + df.format(idade));
        //-------------------------------
        int quantidade = 9750;
        df.applyPattern("#0,000");
        System.out.println("Quantidade : " + df.format(quantidade));
        //---------------------------
        long estoque = 198564;
        df.applyPattern("#,##0,000");
        System.out.println("Estoque    : " + df.format(estoque));
        //--------------------------------------
        double altura = 1.7;
        df.applyPattern("#0.00");
        System.out.println("altura     : " + df.format(altura));

        double peso = 70.25589452;
        df.applyPattern("#0.00");
        System.out.println("Peso       : " + df.format(peso));

        double valorEmReais = 2583.75;
        df.applyPattern("R$ #,##0.00");
        System.out.println("Valor em Reais: " + df.format(valorEmReais));
    }
}

