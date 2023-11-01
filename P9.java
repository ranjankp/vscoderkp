public class P9 {
    public static void main(String[] args) {
        int n=10;
        int st =1;
        int sp = n/2-1;
        int c=0;
        for (int i = 0; i < n/2-1; i++) {
            for (int j = 0; j < sp; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < st; k++) {
                System.out.print(" * ");
            }
            System.out.println();
            sp--;
            st+=2;
        }
        for (int l = 5; l < n; l++) {

            for (int j = 0; j < sp; j++) {
                System.out.print("   ");
            }
            for (int k = 0; k < st; k++) {
                System.out.print(" * ");
            }
            System.out.println();
            st-=2;
            sp++;
        }
    }
}
