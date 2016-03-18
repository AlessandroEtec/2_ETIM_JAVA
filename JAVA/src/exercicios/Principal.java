package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Alessandro
 * @create: 11/03/2016, 13:25:19
 */
public class Principal {

    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog(null, "Selecione o Exercicios");
        int opcao = Integer.parseInt(valor);
        switch (opcao) {
            case 1:
                Exercicio01.main(null);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
        }
    }

}

        













//String valor = JOptionPane.showInputDialog(null,"Qual exercicio deseja executar");
