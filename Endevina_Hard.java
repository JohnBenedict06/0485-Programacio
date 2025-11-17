import java.util.Scanner;
import java.util.Random;

public class Endevina_Hard {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        Random rand = new Random();

        int num_intent = 3;
        int num_secret = rand.nextInt(50);

        System.out.println("Endevina el número secret! Tens " + num_intent + " intents.");
        int num = s.nextInt();

        while (num != num_secret) {

            num_intent = num_intent - 1;

            if (num_intent == 0){
                System.out.println("Has superat el limit d'intents. El número era: " + num_secret);
                break;
            }
            
            System.out.println("Endevina el número secret! Tens " + num_intent + " intents.");
            System.out.println("Introdueix un número: ");
            num = s.nextInt();

            if (num == num_secret) {
            System.out.println("Molt bé! Has encertat el número secret: " + num_secret);
            break;
            }
            
            System.out.println("Incorrecte! Intents restants: " + num_intent);
        }
        s.close();   
    }
}