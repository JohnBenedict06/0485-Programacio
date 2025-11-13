import java.util.Scanner;

public class menu_interactiu {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        boolean sortir = false;
        int menu = 4;
        
        do {
            System.out.println("-------------------------------------------------------\n" +
            "---Menu Interactiu---- \n" +
            "1. Mostrar un missatge de benvinguda. \n" + "2. Mostrar la  data actual. \n" +
            "3. Realitzar una suma. \n" +
            "4. Sortir. \n" +
            "Tria un número entre 1-4: ");
            int selec = lector.nextInt();
            switch (selec) {
                case 1:
                    System.out.println("Benvingut al programa!");
                    break;
                case 2:
                    System.out.println("09/10/2025");
                    break;
                case 3:
                    System.out.println("Introdueix el primer número: ");
                    int num1 = lector.nextInt();
                    System.out.println("Introdueix el segon número: ");
                    int num2 = lector.nextInt();
                    System.out.println("Resultat es: " + (num1+num2));
                    break;
                case 4:
                    System.out.println("Gràcies per utilitzar el programa! Fins aviat");
                    sortir = true;
                    break;  
                default:
                    System.out.println("No és una opció.");
                    break;
            }
        } while (!sortir);

    }
}