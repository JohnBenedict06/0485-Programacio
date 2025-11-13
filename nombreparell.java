public class nombreparell {

    public static void main(String[] args) {
        int[] arrayNumParell = new int[100];
        System.out.println("Array amb els 100 primers nombres parells: ");

        int j = 0;

        for(int i = 0; i < arrayNumParell.length; i++) {
            if((j%2)==0) {
                arrayNumParell[i] = j;
                System.out.println(arrayNumParell[i]);
                j = j+2;
            }
        }
    }
}