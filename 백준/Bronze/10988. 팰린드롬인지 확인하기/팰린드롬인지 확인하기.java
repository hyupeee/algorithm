import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] arr = str.split("");

        String eq = "";

        for (int i = arr.length - 1; i >= 0; i--) {
            eq += arr[i];
        }

        if (str.equals(eq) || str == eq) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}