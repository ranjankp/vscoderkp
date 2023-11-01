package Resursion;

import java.util.Scanner;

public class Factorial {

    static int Fact_of_num(int x){
        
        int sum =1;
        if(x==0){
            return 1;
        }
        return x* Fact_of_num(x-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Fact_of_num(x));
    }
}
