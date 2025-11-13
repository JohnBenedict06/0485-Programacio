import java.util.Scanner;
public class NotaAlta {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Quants valors vols introduir? ");
        int a = s.nextInt();
        int[] nota = new int[a];
        boolean deu = false;

        for(int i = 0; i < nota.length; i++) {
            System.out.println("Introdueix la nota " + (i+1) + ": ");
            nota[i] = s.nextInt();
            if(nota[i] == 10){
                deu = true;
            }
        }
        if(deu != false){
            System.out.println("Si, hi ha almenys un alumne amb un 10");
        }
        else{
            System.out.println("No hi ha cap alumne amb un 10");
        }
    }
}