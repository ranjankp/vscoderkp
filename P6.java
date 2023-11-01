
public class P6 {
    public static void main(String[] args) {
        int n =5;
        int x=1;
        for (int i = 0; i < n; i++) {

            for (int j = i ; j < n; j++) {
                System.out.print(x +" ");
                x++;
            }
            System.out.println();
            x=1;
        }
    }
}
