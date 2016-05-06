package exercicios;

import java.util.Scanner;

/**
 * Calcular o preço de venda de um terreno retangular, sendo dadas as medidas de
 * frente e de um dos lados do terreno (em metros) e o preço do metro quadrado.
 *
 * @author Alessandro
 */
public class Exercicio03 {
 
    public static void main(String[] args) {
        double lado, frente, area, precoMetro, precoVenda;
        Scanner leia = new Scanner(System.in);
        System.out.println("Calcula o preço do terreno");
        System.out.print("Frente: ");
        frente = leia.nextDouble();
        System.out.print("Lado: ");
        lado = leia.nextDouble();
        System.out.print("Preço m2: ");
        precoMetro = leia.nextDouble();
        area = lado * frente;
        precoVenda = area * precoMetro;
        System.out.println("A Área é: " + area + " m2 e o preço do Terreno é R$ " + precoVenda);
    }
}
