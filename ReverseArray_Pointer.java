package Resursion;

public class ReverseArray_Pointer {
        static void reverse_array(int arr[],int n){
            int p1=0;int p2=n-1;

            while(p1 < p2){
               int temp= arr[p1];
               arr[p1] = arr[p2];
               arr[p2] = temp;
               p1++;
               p2--;
               
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
            }
        }
        
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        int n = arr.length;
        reverse_array(arr,n);


    }
}
