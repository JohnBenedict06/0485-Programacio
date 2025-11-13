import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        
        Scanner potencia = new Scanner(System.in);

        System.out.println("Fins a que numero vols anar cercant potències de dos?");
        
        int i = potencia.nextInt();
        int num = 1;
        do {
            System.out.println(num);
            num = num * 2;
        } while (num <= i);
    }
}