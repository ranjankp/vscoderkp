package Resursion;

public record Palindrom() {

    static void Palindrom_str(String str){
        int n = str.length();
        int left =0;
        int right=n-1;

        while (left<right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            } else {
                
            }
        }
    }

    public static void main(String args[]){
        String str = "abssbs";
        Palindrom_str(str);
    }
}
