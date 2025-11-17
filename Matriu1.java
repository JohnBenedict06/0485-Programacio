import java.util.Scanner;

public class Matriu1 {
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

        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    matriu[i][j] = 1;
                } else if (i % 2 == 0 && j % 2 == 1) {
                    matriu[i][j] = 2;
                } else if (i % 2 == 1 && j % 2 == 0) {
                    matriu[i][j] = 3;
                } else {
                    matriu[i][j] = 4;
                }
            }
        }

        System.out.println("Matriu transformada:");
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }

        s.close();
    }
}
