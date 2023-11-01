public class P19 {
    public static void main(String[] args) {
        int n = 5;
        int sp =0;
        for (int i = 0; i <= n; i++) {
            //pattern
            for (int j = 1 ; j<=n-i; j++) {
                System.out.print(" * ");
            }
            //space
            for (int k = 0; k < sp; k++) {
                System.out.print("   ");
            }
            //pattern
            for (int j = 1 ; j<=n-i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
           sp+=2;
        }
        sp=8;
        for (int i = 1; i <= n; i++) {
            //pattern
            for (int j = 1 ; j<=i; j++) {
                System.out.print(" * ");
            }
            //space
            for (int k = 0; k < sp; k++) {
                System.out.print("   ");
            }
            //pattern
            for (int j = 1 ; j<=i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
            sp-=2;
        }

    }
}
