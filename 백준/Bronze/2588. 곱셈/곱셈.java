import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // 숫자 입력 받기
        String numA = br.readLine();
        String numB = br.readLine();

        int answerA = Integer.parseInt(numA) * Integer.parseInt(numB.substring(2));
        int answerB = Integer.parseInt(numA) * Integer.parseInt(numB.substring(1, 2));
        int answerC = Integer.parseInt(numA) * Integer.parseInt(numB.substring(0, 1));
        int answer  = Integer.parseInt(numA) * Integer.parseInt(numB);
        System.out.println(answerA);
        System.out.println(answerB);
        System.out.println(answerC);
        System.out.println(answer);
    }
}