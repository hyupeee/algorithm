import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(" ");

        String strA =  arr[0];
        String strB =  arr[1];

        StringBuffer sbA = new StringBuffer(strA);
        StringBuffer sbB = new StringBuffer(strB);

        int numA = Integer.parseInt(sbA.reverse().toString());
        int numB = Integer.parseInt(sbB.reverse().toString());

        if (numA > numB) {
            System.out.println(numA);
        } else {
            System.out.println(numB);
        }
    }
}