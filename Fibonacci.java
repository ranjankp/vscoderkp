
package Resursion;
public class Fibonacci {

    public static void fibo_series(int n, int sum){
        int f =0;int s=1;
        for (int i = 0; i <=n; i++) {
            System.out.println(f);
            sum = f+s;
            f=s;
            s=sum;
        }
        
    }
    public static void main(String[] args) {
        int n =5;
        int sum =0;
        fibo_series(n,sum);
    }
}
