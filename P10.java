public class P10 {
    public static void main(String[] args) {
        int n = 9;
        int st = 1;
        for (int i = 0; i < n; i++) {
              for (int j = 0; j < st; j++) {
                System.out.print(" * ");
              }
              if(i > n/2-1){
                st--;
              }else{
                st++;
              }
              System.out.println();
        }
    }

}
