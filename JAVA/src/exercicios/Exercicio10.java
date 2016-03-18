package exercicios;

import javax.swing.JOptionPane;

/**
 * Leia a idade de um atleta e classifique-o em uma das seguintes categorias:
 * <ul>
 * <li>Infantil = 5 a 11 anos;</li>
 * <li>Juvenil = 12 a 17 anos; </li>
 * <li>Adultos = Maiores de 18 anos.</li>
 * <ul>
 *
 * @author Alessandro
 * @create: 04/03/2016, 12:44:46
 */
public class Exercicio10 {

    public static void main(String[] args) {
        String valor = JOptionPane.showInputDialog("Digite a idade do Atleta");
        int idade = Integer.parseInt(valor);
        if (idade < 5) {
            JOptionPane.showMessageDialog(null, "Idade Inválida");
        } else if (idade <= 11) {
            JOptionPane.showMessageDialog(null, "Categoria Infantil");
        } else if (idade <= 17) {
            JOptionPane.showMessageDialog(null, "Categoria Juvenil");
        } else {
            JOptionPane.showMessageDialog(null, "Categoria Adulto");
        }
    }
}
