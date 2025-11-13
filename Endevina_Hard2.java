import java.util.Scanner;
import java.util.Random;

public class Endevina_Hard2 {
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        Random random = new Random();

        int num_secret = random.nextInt(10);
        int max_intent = 3;
        boolean check = false;

        System.out.println("Endevina el número secret! Tens " + max_intent + " intents.");
        max_intent = max_intent - 1;

        for (int intents = 0; intents <= max_intent; max_intent--) {
            System.out.println("Introdueix un número: ");
            int num = lector.nextInt();

            if (num == num_secret) {
                System.out.println("Molt bé! Has encertat el número secret: " + num_secret);
                check = true;
                break;
            }
            else {
                System.out.println("Incorrecte! Intents restants: " + max_intent);
            }
        }
        if (!check) {
        System.out.println("Has superat el limit d'intents. El número secret era: " + num_secret);
        }
    }
}