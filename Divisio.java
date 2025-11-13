import java.util.Scanner;

public class Divisio {
    public static void main(String[] args) {

        Scanner div = new Scanner(System.in);

        System.out.println("Quin és el dividend: ");
        int dividend = div.nextInt();
        System.out.println("Quin és el divisor: ");
        int divisor = div.nextInt();
        int divisio = 0;
        do {
            dividend = dividend - divisor;
            System.out.println("Bucle: per arar el dividend val " + dividend);
            divisio++;
        } while (dividend >= divisor);
        System.out.println("El resultat és: " + dividend);
        System.out.println("El resultat de la divisió és: " + divisio);
    }
}