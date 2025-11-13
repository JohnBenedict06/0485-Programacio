import java.util.Scanner;

public class TaulaMultiplicarInversa {
    public static void main(String[] args) {
        
        Scanner calculo = new Scanner(System.in);

        System.out.println("Quina taula de multiplicar vols?");
        int num1 = calculo.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.println(num1 + "*" + i + "=" + (num1*i));
        }
        System.out.println("Aquesta ha estat la taula del " + num1);
    }
}   