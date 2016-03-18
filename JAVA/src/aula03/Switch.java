package aula03;

/**
 *
 * @author Alessandro
 * @create: 11/03/2016, 13:13:45
 */
public class Switch {

    public static void main(String[] args) {
        int opcao = 10;
        switch (opcao) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Valor Invalido");
        }
    }
}
