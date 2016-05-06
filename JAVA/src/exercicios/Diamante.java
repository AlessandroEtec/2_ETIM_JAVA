package exercicios;

/**
 *
 * @author Alessandro
 * @create: 18/03/2016, 14:31:41
 */
public class Diamante {

    public static char[] criaVetor(char inicio, char fim) {
        int tamanho = fim - inicio + 1;
        int q = tamanho * 2 - 1;
        char[] x = new char[q];
        char tempFim = fim;
        int i = 0;
        for (; fim >= inicio; fim--) {
            x[i] = fim;
            i++;
        }
        fim = tempFim;
        inicio++;
        while (inicio <= fim) {
            //  System.out.println(inicio);
            x[i] = inicio;
            inicio++;
            i++;
        }
        //  System.out.println(Arrays.toString(x));
        return x;
    }

    public static void main(String[] args) {
        char inicio = 'a';
        char fim = 'z';
        char[] letras = criaVetor(inicio, fim);
        int exibe = (letras.length) / 2;
        int pos = 0;
        boolean vai = true;
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras.length; j++) {
                if (j == exibe + pos) {
                    System.out.print(letras[exibe + pos]);
                } else if (j == exibe - pos) {
                    System.out.print(letras[exibe - pos]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (exibe - pos == 0 || !vai) {
                pos--;
                vai = false;
            } else {
                pos++;
            }
        }

    }
}
