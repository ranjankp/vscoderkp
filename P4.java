public class P4 {
    public static void main(String[] args) {
        int n =5;
        int x =0;
        for (int i = 0; i <=n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(x+" ");
            }
            System.out.println();
            x++;
        }
    }
}
