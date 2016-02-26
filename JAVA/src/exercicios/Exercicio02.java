/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
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
