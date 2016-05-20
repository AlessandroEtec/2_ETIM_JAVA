package metodos;

/**
 * @author Alessandro
 * @create: 06/05/2016, 12:38:15
 */
public class Matematica {
    public static void main(String[] args) { 
        double a = 5.8;
        double b = 2.5;
        double c = -8.3;
        System.out.println("Valor de PI: "+Math.PI);
        System.out.println("Valor Absoluto: "+Math.abs(c));
        System.out.println("Maior Valor: "+Math.max(5,2));
        System.out.println("Menor Valor: "+Math.min(a,b));
        System.out.println("Arredonda para Cima: "+Math.ceil(a));
        System.out.println("Arredonda para Baixo: "+Math.floor(a));
        System.out.println("Hipotenusa: "+Math.hypot(3, 4));
        System.out.println("Potencia: "+Math.pow(2, 10));
        System.out.println("Raiz: "+Math.sqrt(9));
        int aleatorio =  (int) (50 * Math.random());
        System.out.println("Valor Aleatorio: "+aleatorio);
    }
}
