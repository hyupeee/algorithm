import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArr = a.toCharArray();
        
        String str = "";
        
        for(char ch : charArr) {
            if(Character.isLowerCase(ch)) {
                str += Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                str += Character.toLowerCase(ch);
            }
        }
        System.out.println(str);
        
    }
}