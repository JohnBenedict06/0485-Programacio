import java.util.Scanner;

public class Descuento95 {
    public static void main(String[] args) {
        Scanner descuento = new Scanner(System.in);

        String simbolo_euro = "\u20AC";
        
        System.out.println("Introdueix el preu del producte: ");
        int preu = descuento.nextInt();

        if (preu >= 95) {
            int preufinal = preu - preu * 15 / 100;
            System.out.println("S'ha aplicat el descompte.");
            System.out.println("El preu final és: " + preufinal + "€");
        }   else {
            System.out.println("No s'ha aplicat el descompte");
            System.out.println("El preu final és: " + preu + simbolo_euro);
        }
    }
}
