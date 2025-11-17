import java.util.Scanner;
public class NotaMedia {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Quants valors vols introduir? ");
        int a = s.nextInt();
        double j = 0;
        int[] nota = new int[a];

        for(int i = 1; i <= nota.length; i++) {
            System.out.println("Introdueix el valor " + i + ": ");
            double b = s.nextDouble();
            j += b;
        }
        System.out.println("La mitjana dels valors és: " + j/a);
        s.close();
    }
}