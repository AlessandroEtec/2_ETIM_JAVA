package exercicios;

import java.util.Scanner;

/**
 * 2) Crie uma classe para calcular a área de um triângulo.
 *
 * @author Alessandro
 */
public class Exercicio02 {

    public static void main(String[] args) {
        double base, altura, area;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a base: ");
        base = leia.nextDouble();
        System.out.print("Digite a altura: ");
        altura = leia.nextDouble();
        area = base * altura / 2;
        System.out.println("A Área é: " + area);
    }
}
