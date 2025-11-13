import java.util.Scanner;

public class Videojoc {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Introdueix el tipus de subscripció (1-4): ");
        int num = numero.nextInt();

        switch (num) {
            case 1:
                System.out.println("Has escollit la subscripció Bàsica");
            break;
            case 2:
                System.out.println("Has escollit la subscripció Estàndard");
            break;
            case 3:
                System.out.println("Has escollit la subscripció Premium");
            break;
            case 4:
                System.out.println("Has escollit la subscripció VIP");
            break;
            default: 
                System.out.println("Opció no vàlida");
        }
    }
}