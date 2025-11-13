import java.util.Scanner;

public class TaulaMultiplicar {
    public static void main(String[] args) {
        
        Scanner calculo = new Scanner(System.in);

        System.out.println("Quina taula de multiplicar vols?");
        int num = calculo.nextInt();
        int i = 0; 
        while (i <= 10) {
            int resultat = num * i;
            System.out.println(num + " * " + i + " = " + resultat);
            i++;
        }
        System.out.println("Aquesta ha estat la taula del " + num);
    }
}