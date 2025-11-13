import java.util.Scanner;

public class Descuento100 {
    public static void main(String[] args) {
        Scanner descuento = new Scanner(System.in);

        String euro = "\u20AC";

        System.out.println("Introdueix el preu dde la compra: ");
        int preu = descuento.nextInt();
        int preufinal = preu - preu * 8 / 100;
        int preufinal2 = preu + 2;

        if (preu >= 100) {
            System.out.println("S'ha aplicat un descompte del 8%.");
            System.out.println("El preu final és: " + preufinal + euro);
        }
        else if (preu <= 30) {
            System.out.println("S'ha aplicat una penalització de 2€");
            System.out.println("El preu final és: " + preufinal2 + euro);
        }
        else {
            System.out.println("No hi ha descompte ni penalització");
            System.out.println("El preu final és: " + preu + euro);
        }
    }
}