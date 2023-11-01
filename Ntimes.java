package Resursion;

import java.util.Scanner;

public class Ntimes {
    
    public static void print_name(int n, int i){
        
        if(i > n) {
            return; 

        }
        System.out.println(" ranjan ");

        print_name(n,i+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        print_name(n,0);
    }
}
