package exercicios;

import java.util.Scanner;

/**
 * Receber um valor inteiro e se este valor for maior que 5 e menor que 20,
 * exibir seu cubo. 
 *
 * @author Alessandro 
 */
public class Exercicio06 {

    public static void main(String[] args) {
        double n;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n = leia.nextDouble();
        if (n > 5 && n < 20) {
            double cubo = n * n * n;
            System.out.println("O Cubo de " + n + " é: " + cubo);
        }
    } 
}
