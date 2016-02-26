/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Alessandro
 */
public class If {

    public static void main(String args[]) {
        int a = 3, b = 0;
        if (a == 3 && b == 0) {
            System.out.println("var a = " + a);
            System.out.println("var b = " + b);
        } else {
            System.out.println("Processando o comando else");
        }
    }
}
