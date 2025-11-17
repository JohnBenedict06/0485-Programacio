import java.util.Scanner;

public class Matriu2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introdueix el nombre de files: ");
        int files = s.nextInt();
        System.out.print("Introdueix el nombre de columnes: ");
        int columnes = s.nextInt();

        int[][] matriu = new int[files][columnes];

        System.out.println("Introdueix els nombres de la matriu:");
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matriu[i][j] = s.nextInt();
            }
        }

        System.out.println("Matriu:");
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }

        int min = matriu[0][0];
        int max = matriu[0][0];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (matriu[i][j] < min) min = matriu[i][j];
                if (matriu[i][j] > max) max = matriu[i][j];
            }
        }

        System.out.println("Valor mínim de la matriu: " + min);
        System.out.println("Valor màxim de la matriu: " + max);

        s.close();
    }
}
