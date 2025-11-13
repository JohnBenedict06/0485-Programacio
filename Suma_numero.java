import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {

        Scanner suma = new Scanner(System.in);

        System.out.println("Introdueix un numero: ");
        int i = suma.nextInt();
        int num = i + 10;
        do {
            System.out.println("Numero: " + i);
            i++;
        } while (i <= num);
    }
}