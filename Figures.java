import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {

    Scanner calculo = new Scanner(System.in);

    System.out.println("Escriu una figura (triangle, cercle, trapezi, rombe, paral·lelogram): ");
    String figura = calculo.nextLine();
    
    switch (figura) {
        case "triangle":
            System.out.println("Introdueix la base: ");
            int num1_triangle = calculo.nextInt();
            System.out.println("Introdueix l'altura: ");
            int num2_triangle = calculo.nextInt();
            double resultat_triangle = (num1_triangle + num2_triangle) / 2.0;
            System.out.println("Àrea del " + figura + ": " + resultat_triangle);
            break;
        case "cercle":
            System.out.println("Introdueix el radi: ");
            int num1_cercle = calculo.nextInt();
            double resultat_cercle = (Math.PI) * Math.pow(num1_cercle, 2);
            System.out.println("Àrea del " + figura + ": " + resultat_cercle);
            break;
        case "trapezi":
            System.out.println("Introdueix la base major: ");
            int num1_trapezi = calculo.nextInt();
            System.out.println("Introdueix la base menor: ");
            int num2_trapezi = calculo.nextInt();
            System.out.println("Introdueix l'altura: ");
            int num3_trapezi = calculo.nextInt();
            double resultat_trapezi = (num1_trapezi + num2_trapezi) + num3_trapezi / 2.0;
            System.out.println("Àrea del " + figura + ": " + resultat_trapezi);
            break;
        case "rombe":
            System.out.println("Introdueix la diagonal major: ");
            int num1_rombe = calculo.nextInt();
            System.out.println("Introdueix la diagonal menor: ");
            int num2_rombe = calculo.nextInt();
            double resultat_rombe = (num1_rombe * num2_rombe) / 2.0;
            System.out.println("Àrea del " + figura + ": " + resultat_rombe);
            break;
        case "paralelogram":
            System.out.println("Introdueix la base: ");
            int num1_paralelogram = calculo.nextInt();
            System.out.println("Introdueix l'altura: ");
            int num2_paralelogram = calculo.nextInt();
            double resultat_paralelogram = num1_paralelogram * num2_paralelogram;
            System.out.println("Àrea del " + figura + ": " + resultat_paralelogram);
            break;
        default:
            System.out.println("Figura no existent");
    }
    }
}