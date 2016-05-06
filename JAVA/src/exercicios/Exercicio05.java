package exercicios;

import java.util.Scanner;

/**
 * Ler um número e verificar se ele é maior que 100. Se for somar 150 a esse
 * número. No final imprima o resultado da soma.
 *
 * @author Alessandro
 */
public class Exercicio05 {

    public static void main(String[] args) {
        double n;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n = leia.nextDouble();
        if (n >= 100) {
            n = n + 150;
            //n += 150;
        }
        System.out.println("O Valor de n = " + n);
    }
}
