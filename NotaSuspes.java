import java.util.Scanner;
public class NotaSuspes {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Quantes notes vols introduir? ");
        int a = s.nextInt();
        int[] nota = new int[a];
        boolean suspes = false;

        for(int i = 0; i < nota.length; i++) {
            System.out.println("Introdueix la nota " + (i+1) + ": ");
            nota[i] = s.nextInt();
            if(nota[i] <= 4){
                suspes = true;
                break;
            }
        }
        if(suspes != false){
            System.out.println("Almenys un alumne ha suspès.");
        }
        else{
            System.out.println("Cap alumne ha suspès.");
        }
    }
}