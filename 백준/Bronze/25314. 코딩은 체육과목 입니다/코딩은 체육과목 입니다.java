import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        List<String> arr = new ArrayList<>();

        for(int i = 0; i < num / 4; i ++) {
            arr.add("long ");
        }

        arr.add("int");

        String answer = "";

        for (String str : arr) {
            answer += str;
        }

        System.out.println(answer);
        
    }
}