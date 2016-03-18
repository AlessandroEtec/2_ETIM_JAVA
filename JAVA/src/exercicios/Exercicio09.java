package exercicios;

import java.util.Scanner;

/**
 * Crie uma classe para ler o nome de um aluno e sua média final. O resultado
 * deve ser uma mensagem informando se o aluno foi aprovado ou não. O critério
 * de aprovação é ter média igual ou superior a 6,0.
 *
 * @author Alessandro
 * @create: 04/03/2016, 12:43:51
 */
public class Exercicio09 {

    public static void main(String[] args) {
        String nome;
        double media;
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite a media: ");
        media = leia.nextDouble();
        leia.nextLine();
        System.out.print("Digite o nome: ");
        nome = leia.nextLine();
        if (media >= 6) {
            System.out.println("O aluno " + nome + "foi Aprovado");
        } else {
            System.err.println("O aluno " + nome + "foi Reprovado");
        }
    }
}
