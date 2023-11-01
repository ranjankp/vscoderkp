public class P8 {
    public static void main(String[] args) {
        int n=5;
        int st = 2*n-1;
        int sp =0;
        for (int i = 0; i < n; i++) {

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
