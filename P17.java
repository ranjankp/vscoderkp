public class P17 {
    public static void main(String[] args) {
        int n=5;
        int alphabet=65;
        int x=0;
       
        int st=1;
        for (int i = 0; i < n; i++) {
            int p = 2*i+1;
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            //pattern
            for (int k = 0; k < p; k++) {
            
                System.out.print((char) (alphabet+x)+ " " );
                if(k>=p/2){
                  x--;  
                }
                else{
                    x++;
                }
            }
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            System.out.println();
            st+=2;
            x=0;
        }
    }
}
 