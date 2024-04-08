import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        while (N != 1){
            if (N % 3 == 0){
                N /= 3;
                ans++;
                break;
            } else if (N % 2 == 0){
                N /= 2;
                ans++;
                break;
            } else {
                N -= 1;
                ans++;
                break;
            }
        }
        System.out.println(ans);
    }
}
