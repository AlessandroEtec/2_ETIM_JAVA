package aula04;

/**
 *
 * @author Alessandro
 * @create: 11/03/2016, 14:05:56
 */
public class For {

    public static void main(String args[]) {
        for (int i = 0; i < 10; i = i + 1) {
            System.out.print(i + " ");
            if (i == 8) {
                break;
            }
        }
    }
}
