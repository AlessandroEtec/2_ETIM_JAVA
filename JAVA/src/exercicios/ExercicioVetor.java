package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Alessandro
 * @create: 08/04/2016, 12:55:34
 */
public class ExercicioVetor {

    //Declaração do vetor 
    static int[] numeros = new int[3];

    public static void main(String[] args) { 
        String[] opcoes = {"Incluir", "Exibir", "Sair","Somar"};
        
        while (true) {
            String opcao = JOptionPane.showInputDialog(
                    null, "Escolha a opção", "Pergunta", 
                    3, null, opcoes, 0).toString();
            System.out.println(opcao);
            if (opcao.equals("Incluir")) {
                adicionar();
            }
            if (opcao.equals("Exibir")) {
                exibir();
            }
            if (opcao.equals("Somar")) {
                somarVetor();
            }
            if (opcao.equals("Sair")) {
                break;
            }
        }

      
    }

    /**
     * Adicionar ou alterar os valores do vetor
     */
    public static void adicionar() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero "));
        }
    }

    /**
     * Exibe os valores do vetor
     */
    public static void exibir() {
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
    }
    
    public static void somarVetor(){
        int soma=0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
            JOptionPane.showMessageDialog(null,"A soma é: "+  soma);
    }

    //Some o vetor
    //Mostre a quantidade de numeros pares
    //Some todos os numeros pares
    //Some todos os numeros impares
    //Mostre o maior numero
    //Ordenar o vetor
}
