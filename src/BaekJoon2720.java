import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2720
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < T ; i++){
            int m = Integer.parseInt(br.readLine());
            int q = m/25;
            int q_r = m%25;
            int d = q_r/10;
            int d_r = q_r%10;
            int n = d_r/5;
            int n_r = d_r%5;
            int p = n_r/1;
            sb.append(q + " " + d + " " + n + " " + p).append("\n");
        }
        System.out.println(sb);
    }
}
