package matriz;

/**
 *
 * @author Alessandro
 * @create: 08/04/2016, 12:50:14
 */
public class Exemplo2 {

    public static void main(String[] args) {

        int numeros[][] = {
            {0, 2, 3, 4, 1},
            {5, 7, 8, 2, 9}
        };

        System.out.println("Número de Linhas: " + numeros.length);
        System.out.println("Número de Colunas: " + numeros[0].length);

        //Exibindo com for
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Linha " + (i + 1) + ": ");
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
