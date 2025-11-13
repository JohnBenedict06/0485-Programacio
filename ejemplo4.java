public class ejemplo4 {
    public static void main (String[] args) {

        int[] a = new int[6];
        int[] b ={7, 10, 25, 40, 50, -50};
        int[] c = new int[6];

        for(int i = 0; i < b.length; i++) {
            System.out.println("Estamos en la iteración " + i + " i el valor és: " + b[i]);
        }
        for(int i = 0; i < a.length; i++) {
            a[i] = i+11;
            /* if(a[i] % 2 != 0) {
                a[i] = 0; 
            } */
           if(i % 2 == 0) {
                a[i] = -1;
           }
            c[i] = b[i] + a[i];
            if(c[i] < 0) {
                c[i] = 0;
            }
            System.out.println(c[i]);
        }
    }
}