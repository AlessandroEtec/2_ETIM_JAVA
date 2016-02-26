package exercicios;

import java.util.Scanner;

/**
 * Efetuar a leitura de 3 valores inteiros e apresentar como resultado final o
 * quadrado da soma dos números.
 *
 * @author Alessandro
 */
public class Exercicio04 {

    public static void main(String[] args) {
        int n1, n2, n3, soma, quadrado;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n1 = leia.nextInt();
        System.out.print("Digite um numero: ");
        n2 = leia.nextInt();
        System.out.print("Digite um numero: ");
        n3 = leia.nextInt();
        soma = n1 + n2 + n3;
        quadrado = soma * soma;
        System.out.println("O Quadradro da soma é: "+quadrado);

    }
}
