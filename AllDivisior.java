import java.util.Scanner;

public class AllDivisior {

    static void All_div(int n){

        for (int i = 1; i <=n; i++) {
            if (n%i==0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        All_div(n);


    }
}
