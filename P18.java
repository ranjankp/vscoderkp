public class P18 {
    public static void main(String[] args) {
        int n=5;
        int alphabet =65;
     
        for (int i = ; i <= n; i++) {
            int ch= alphabet+ n-1;
            for (int j = 1; j <= i; j++) {

                System.out.print((char) ch+" ");
                ch--;
            }  
            System.out.println();

        }
    }
}
