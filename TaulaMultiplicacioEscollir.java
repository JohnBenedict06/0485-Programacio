import java.util.Scanner;

public class TaulaMultiplicacioEscollir {
    public static void main(String[] args) {
        
        Scanner calculo = new Scanner(System.in);

        System.out.println("Fins quina taula de multiplicar vols conèixer? ");
        int num_usuari = calculo.nextInt();
        
        for (int i = 1; i <= num_usuari; i++) {
            System.out.println("Taula del " + i);
            for (int x = 1; x <= 10; x++) {
                int resultat = x * i;
                System.out.println(x + " * " + i + " = " + resultat);
            }
            System.out.println("--------------");
        }
    }
}
