package exercicios;

import java.util.Scanner;

/**
 * Crie uma classe para calcular a área de um <b>retângulo</b>.
 * 
 *
 * @author Alessandro
 */
public class Exercicio01 {

    public static void main(String[] args) {
        double base, altura, area;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a base: ");
        base = leia.nextDouble();
        System.out.print("Digite a altura: ");
        altura = leia.nextDouble();
        area = base * altura;
        System.out.println("A Área é: " + area);
    } 
}
