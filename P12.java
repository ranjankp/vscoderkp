public class P12 {
    public static void main(String[] args) {
        int n =5;
        int x = 1;
        int sp = n+1;
        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(x +" ");
                x++;
            }
            for(int k= 0;k<sp;k++){
                System.out.print("* ");
            }
            for (int l = 0; l < i; l++) {
                x--;
                 System.out.print(x +" ");
            }
            
            System.out.println();
            x=1;
            sp-=2;
        }
    }
}
