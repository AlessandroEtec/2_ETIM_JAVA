package exercicios;

import java.util.Scanner;

/**
 *
 * Leia 2 valores maiores que 0 e mostre a diferença entre eles.
 *
 * @author Alessandro
 * @create: 04/03/2016, 12:34:25
 *
 */
public class Exercicio07 {

    public static void main(String[] args) {  
        Scanner leia = new Scanner(System.in);
        int n1, n2;
        System.out.print("Digite um numero: ");
        n1 = leia.nextInt();
        System.out.print("Digite um numero: ");
        n2 = leia.nextInt();
        if (n1 <= 0 || n2 <= 0) { 
            System.err.println("Os numeros devem ser maiores que ZERO");
        } else {
            int dif = n1 - n2;
            if (dif < 0) { 
                dif *= -1;
                // dif = dif * -1;
            }
            System.out.println("A diferença entre eles é: " + dif);
        }
    }
}
