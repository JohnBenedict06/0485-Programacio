import java.util.Scanner;

public class temperatura_setmanal {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Digues una temperatura de Dilluns a Diumenge: ");
        int[] dies = new int[6];
        String[] semana = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Dissabte", "Diumenge"};
        double media = 0;
        double alta = 0;
        double baja = 0;

        for(int i = 0; i < dies.length; i++ ){
            System.out.println(semana[i] +":");
            int temperatura = s.nextInt();
            if (i <= dies.length){
                System.out.println(temperatura + " graus");
            }
            media += temperatura;
            if(alta <= temperatura) {
                alta += temperatura;
            }
            if(baja >= temperatura) {
                baja = temperatura;
            }
        }
        System.out.println("La temperatura mitjana és de: " + media/dies.length);
        System.out.println("La temperatura més alta és de: " + alta);
        System.out.println("La temperatura mínima és de: " + baja);
        s.close();
    }
}