package metodos;

/**
 * Exemplo
 *
 * @author Alessandro
 * @create 13/05/2016
 */
public class Texto {

    public static void main(String[] args) {
        String nome = "Etec Antonio Devisate";
        String texto = "batata";
        String texto2 = "Batata";
        char[] vetorCaracteres;
        System.out.println("Maiusculo: " + nome.toUpperCase());
        System.out.println("Minusculo: " + nome.toLowerCase());
        System.out.println("Tamanho: " + nome.length());
        System.out.println("Texto: " + texto.replace("t", "n"));
        System.out.println("Caracter: " + nome.charAt(0));
        System.out.println("Contem: " + texto.contains("ta"));
        System.out.println("É IGUAL????---> " + (texto == texto2));
        vetorCaracteres = nome.toCharArray();
        System.out.println("Vetor de Caracteres");
        for (int i = 0; i < vetorCaracteres.length; i++) {
            System.out.println(vetorCaracteres[i]);
        }
        System.out.println("Igual: " + texto.equals(texto2));
        System.out.println("Igual: " + texto.equalsIgnoreCase(texto2));
        System.out.println("Pedaço: " + nome.substring(5, 12));
        System.out.println("Achou: " + nome.indexOf("e"));
        System.out.println("Achou: " + nome.lastIndexOf("e"));
        char numero = '2';
        char letra = 'd';
        System.out.println("É numero: " + Character.isDigit(numero));
        System.out.println("É numero: " + Character.isDigit(letra));
        System.out.println("É letra: " + Character.isLetter(numero));
        System.out.println("É letra: " + Character.isLetter(letra));
        System.out.println("É espaço: " + Character.isSpaceChar(letra));
        System.out.println("É espaço: " + Character.isSpaceChar(numero));
        System.out.println("Maiusculo: "+ Character.toUpperCase(letra));
        System.out.println("Maiusculo: "+ Character.toUpperCase(numero));

    }

}
