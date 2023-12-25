import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st1.nextToken());
        int[] arr = new int[N];
        int M = Integer.parseInt(st1.nextToken());

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());
            int K = Integer.parseInt(st2.nextToken());

            for (int j = I - 1; j < J; j++) {
                arr[j]= K;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();
        
    }
}