import java.util.Scanner;

public class NumOfDigits {

    static int count_digits(int n)
    {
       int x = n; int count =0;
       while( x!=0 ) 
      {
          x = x / 10;
          count++;
      }
       return count;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(" nu of digits");
        System.out.println("Number of digits in "+n+" is "+count_digits(n));

    }
}
