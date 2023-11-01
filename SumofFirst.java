package Resursion;

import java.util.Scanner;

public class SumofFirst {

    static void SumofNatural_num(int n, int sum){
       
        if (n<1) {
            System.out.println(sum);
            
            return;
        }
        SumofNatural_num(n-1, sum+n);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        SumofNatural_num(n,0);
    }
}
