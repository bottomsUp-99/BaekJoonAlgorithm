import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] count = new int[10];
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int total = A*B*C;
        String str = String.valueOf(total);
        for (int i = 0 ; i < str.length() ; i++){
            count[str.charAt(i) - '0']++;
        }
        for (int num : count){
            System.out.println(num);
        }
    }
}
