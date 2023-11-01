public class P22 {
    public static void main(String[] args) {
        int n=4;
        int x=7;
      
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int down=(2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,down), Math.min(left, right))+ " ");
            }
            System.out.println();
        }
    }
}
