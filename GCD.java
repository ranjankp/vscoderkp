import java.util.Scanner;

public class GCD {

    static int  gcd_num(int num1,int num2){

        int gcd =1;
        for (int i = 1; i <= Math.min(num1, num2); i++) {
            if(num1%i==0 && num2 % i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        System.out.println("GCD of two num is:"+ gcd_num(n1,n2));
            }
}
