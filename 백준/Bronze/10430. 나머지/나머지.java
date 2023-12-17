import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        String[] arr = br.readLine().split(" ");

        //(A+B)%C
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int answer1 = (a + b) % c;
        int answer2 = (a * b) % c;

        System.out.println(answer1);

        //((A%C) + (B%C))%C
        System.out.println(answer1 % c);

        //(A×B)%C
        System.out.println(answer2);

        //((A%C) × (B%C))%C
        System.out.println(answer2 % c);

    }
}