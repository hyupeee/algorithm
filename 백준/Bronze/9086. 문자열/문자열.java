import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        List<String> arr = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            arr.add(br.readLine());
        }

        for (String str : arr) {
            bw.write("" + str.charAt(0) + str.charAt(str.length() - 1));
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}