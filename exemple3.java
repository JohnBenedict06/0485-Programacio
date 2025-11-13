import java.util.Scanner;

public class exemple3 {

    public static void main(String[] args) {

        int[] arrayEnters = {3,12,18,34,7,10};
        int mida = arrayEnters.length;

        for (int i = 0; i < mida; i++) {
            if (arrayEnters[i] % 2 != 0) {
                System.out.println(arrayEnters[i]);
            }
        }
    }
}
