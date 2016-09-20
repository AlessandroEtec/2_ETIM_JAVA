package vetor;

public class Exemplo2 {

    public static void main(String[] args) {
        int numeros[] = {0, 2, 3, 4, 1};
        System.out.println("tamanho do vetor: " + numeros.length);

        //Exibindo com for
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        
        //Exibindo com foreach
        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
