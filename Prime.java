public class Prime {


    static void prime_num(int n){
        int count =0;
        for (int i = 1; i*i<=n; i++) {
            if(n%i==0){
                count++;
                if ((n/i)!=i) {
                    count++;
                }
            }
            if(count == 2){
                System.out.println("prime no");
            }else{
                System.out.println("notprime");
            }
        }

    }
    public static void main(String[] args) {
        int n =6;
        prime_num(n);
        
    }
}
