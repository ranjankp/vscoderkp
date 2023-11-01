import java.util.Scanner;

public class Reverse {

    static int Reverse_num(int n){
        int rev=0;
        while (n!=0) {
            int digits =n%10;
            rev=rev*10+digits;
            n = n/10;
 
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Reverse_num(n));
    }
}
