package Resursion;

public class Reversearray {
    static void reverse_array(int arr[]){
        int n = arr.length;
        int revarr[] = new int[n];


        for (int i = n-1; i >=0; i--) {   
            revarr[n-i-1] = arr[i];
        }

        
        for (int i = 0; i < revarr.length; i++) {
            System.out.print(revarr[i]);
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse_array(arr);
    }
}
