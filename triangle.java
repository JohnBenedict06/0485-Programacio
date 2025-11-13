import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner triangle = new Scanner(System.in);

        System.out.println("Digues un numero: ");
        int num = triangle.nextInt();

        for (int i = 0; i >= num; num++) {
            System.out.println(i + "* ");
        }
    }
}
