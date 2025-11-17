import java.util.Scanner;

public class MaximMinim {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Quants elements tindrà el vector? ");
        
        int pos = s.nextInt();

        int[] vector = new int[pos];
        int min = vector[0];
        int max = vector[0];

        for (int i = 0; i < pos; i++) {
            System.out.print("Introdueix el valor " + (i + 1) + ": ");
            vector[i] = s.nextInt();
        }
        for (int i = 1; i < pos; i++) {
            if (vector[i] < min) min = vector[i];
            if (vector[i] > max) max = vector[i];
        }
        System.out.print("\nEl vector és: {");
        for (int i = 0; i < pos; i++) {
            System.out.print(vector[i]);
            if (i < pos - 1) System.out.print(", ");
        }
        System.out.println("}");
        System.out.println("\nEl nombre més petit del vector és: " + min);
        System.out.println("El nombre més gran del vector és: " + max);
        s.close();
    }
}
