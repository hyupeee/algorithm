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

        for(int i = 0; i < arr.length; i ++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st2.nextToken());
            int J = Integer.parseInt(st2.nextToken());

            int k = 0;
            k = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = k;
        }

        for (int k = 0; k < arr.length; k++) {
            bw.write(arr[k] + " ");
        }

        br.close();
        bw.flush();
        bw.close();

    }
}