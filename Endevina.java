import java.util.Scanner;
import java.util.Random;

public class Endevina {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        String valor = "Quin valor creus que és?";

        System.out.println("Comencem el joc.");
        System.out.println("Endevina el valor enter, entre 0 i 10.");
        System.out.println(valor);
        
        int num = lector.nextInt();
        int num_secret = random.nextInt(10);

        while (num != num_secret) {
            System.out.println("Has fallat! Torn a intentar-ho..." + valor);
            num = lector.nextInt();
        }

        System.out.println("Enhorabona. Per fi l'has encertat!");
    }
}