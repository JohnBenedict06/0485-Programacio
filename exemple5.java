import java.util.Scanner;

public class Exemple5 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        int[] a = new int[5];
        int mida = a.length;
        int suma = 0;

        System.out.println("Escriu 5 números:");
        for (int i = 0; i < mida; i++) {
            a[i] = lector.nextInt();
        }
        for (int i = 0; i < mida; i++) {
            if (i % 2 != 0) {
                suma += a[i];
            }
        }

        System.out.println("La suma dels elements amb índex senar és: " + suma);
    }
}
