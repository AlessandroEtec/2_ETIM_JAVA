package exercicios;

import java.util.Scanner;

/**
 * Leia 3 números e exiba o maior deles.
 *
 * @author Alessandro
 * @create: 04/03/2016, 12:41:26
 */
public class Exercicio08 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1, n2, n3, maior;
        System.out.print("Digite um numero: ");
        n1 = leia.nextInt();
        System.out.print("Digite um numero: ");
        n2 = leia.nextInt();
        System.out.print("Digite um numero: ");
        n3 = leia.nextInt();
        if (n1 >= n2 && n2 >= n3) {
            maior = n1; 
        } else if (n2 >= n3) {
            maior = n2;
        } else {
            maior = n3;
        }
        System.out.println("O Maior numero é: " + maior);
    }
}
