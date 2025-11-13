import java.util.Scanner;

public class SumaMultiple {
    public static void main(String[] args) {

        Scanner multiple = new Scanner(System.in);

        System.out.println("Fins a quin valor vols sumar múltiples de 3? ");
        int num = multiple.nextInt();
        int resultat = 0;
        for (int i = 0; i <= num; i = i+3) {
            System.out.println("Afegim " + i + " ...");
            resultat = resultat+i;
        }
        System.out.println("El resultat és " + resultat);

    }
}