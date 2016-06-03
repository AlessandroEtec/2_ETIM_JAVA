package matriz;

/**
 *
 * @author Alessandro
 * @create: 03/06/2016, 13:02:37
 */
public class Exemplo1 {
    public static void main(String[] args) {
        
    //declaração da Matriz
        int[][] numeros = new int[2][3];

        //atribuição da Matriz
        numeros[0][0] = 2;
        numeros[0][1] = 4;
        numeros[0][2] = 6;
        numeros[1][0] = 3;
        numeros[1][1] = 5;
        numeros[1][2] = 7;

        //Exibe valores da Matriz
        System.out.println("Linha 1 - Coluna 1: " + numeros[0][0]);
        System.out.println("Linha 1 - Coluna 2: " + numeros[0][1]);
        System.out.println("Linha 1 - Coluna 3: " + numeros[0][2]);
        System.out.println("Linha 2 - Coluna 1: " + numeros[1][0]);
        System.out.println("Linha 2 - Coluna 2: " + numeros[1][1]);
        System.out.println("Linha 2 - Coluna 3: " + numeros[1][2]);
    }

}
