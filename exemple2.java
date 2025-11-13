import java.util.Scanner;

public class exemple2 {

    public static void main(String[] args) {

        int[] arrayEnters;
        arrayEnters = new int[5];
        int mida = arrayEnters.length;

        for (int i = 0; i < mida; i++) {
            arrayEnters[i] = i * 2;
            int suma = 10 + arrayEnters[i];
            System.out.println("El resultat de sumar 10 + " + arrayEnters[i] + " = " + suma);
        }
    }
}
