import java.util.Scanner;

public class Palindrom {

    static boolean Palindrom_num(int num){

        int orignal=num;
        if(num==0){
            return false;
        }
        int y=0;

        while(num!=0){
            int p=num%10;
            y=y*10+p;
            num=num/10;
        }
        if(orignal==y){
            return true;
        }else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Palindrom_num(num));

    }
}
