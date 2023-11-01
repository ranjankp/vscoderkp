public class P15 {
    public static void main(String[] args) {
        int n=5;
        int alphabet=65;
        int x=0;
        for (int i = 0; i < n; i++) {

            for (int j = i ; j < n; j++) {
                System.out.print((char) (alphabet+x)+ " " );
                x++;
            }
            System.out.println();
             x=0;
        }
    }
}
