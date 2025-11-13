import java.util.Scanner;
public class exemple4char {

    public static void main (String[] args) {
        char[] arrayVocals = new char[8];
        System.out.println("Escriu 8 lletres o caràcters especials");

        Scanner s = new Scanner(System.in);

        int j = 0;
        //LOOP DE LECTURA DELS VALORS
        while (j < arrayVocals.length) {
            String input = s.next();
            char letra = input.charAt(0);
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                letra = '0';
            }

            arrayVocals[j] = letra;

            System.out.println("Estic escrivint: " + arrayVocals[j]);
            ++j;
        }

        for (int i = 0; i < arrayVocals.length; ++i){
            System.out.println(arrayVocals[i]);
        }
    }
}