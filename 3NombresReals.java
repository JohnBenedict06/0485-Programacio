import java.util.Scanner;

public class Multiplicacio {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Introdueix el primer nombre: ");
        int num1 = numero.nextInt();
        
        System.out.println("Introdueix el segon nombre: ");
        int num2 = numero.nextInt();
        
        System.out.println("Introdueix el tercer nombre: ");
        int num3 = numero.nextInt();
        
        int resultat = num1 * num2 * num3;

        System.out.println("El resultat de la teva multiplicació és: " + resultat);
    }
}