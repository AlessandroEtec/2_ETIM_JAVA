package metodos;

import java.util.Arrays;

/**
 *
 * @author Alessandro
 * @create: 13/05/2016, 14:03:21
 */
public class Vetores { 

    public static void main(String[] args) {
        int[] vetor = {5, 2, 1, 4, 3};
        System.out.println("Valores do Vetor: " + Arrays.toString(vetor));
        Arrays.sort(vetor);
        System.out.println("Vetor Ordenado: " + Arrays.toString(vetor));
        int valor = 2;
        int posicao = Arrays.binarySearch(vetor, valor);
        if (posicao >= 0) {
            System.out.println("Achou o numero ");
        } else {
            System.out.println("Não Achou");
        }
    }
}
