package Resursion;

public class Reverse_recursive {
        static void reverse_array(int arr[],int p1,int p2){
            

            if(p1 < p2){
               int temp= arr[p1];
               arr[p1] = arr[p2];
               arr[p2] = temp;
               
               reverse_array(arr, p1+1,p2-1);
            }  
        }
        static void print(int arr[], int n){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
        
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        reverse_array(arr,0,n-1);
        print(arr,n);


    }
}
