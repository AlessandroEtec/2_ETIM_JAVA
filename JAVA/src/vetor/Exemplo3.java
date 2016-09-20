package vetor;

import javax.swing.JOptionPane;

public class Exemplo3 {

    public static void main(String[] args) {

        int tamanho = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Digite a quantidade de alunos "));

        //Declarando os vetores
        String nomes[] = new String[tamanho];
        double notas[] = new double[tamanho];

        //Atribuindo Valores aos vetores
        for (int i = 0; i < tamanho; i++) {
            nomes[i] = JOptionPane.showInputDialog(null, "Digite o nome do Aluno");
            notas[i] = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Digite a nota do aluno "));
        }
        //Exibindo o vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Nota: " + notas[i]);
            System.out.println("-------------------------");
        }
    }
}


