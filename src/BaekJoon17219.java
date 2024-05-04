import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon17219
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> memo = new HashMap<>();
        for (int i = 0 ; i < N ; i++) {
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String passWord = st.nextToken();
            memo.put(site, passWord);
        }
        for (int i = 0 ; i < M ; i++) {
            String key = br.readLine();
            sb.append(memo.get(key)).append("\n");
        }
        System.out.println(sb);
    }
}
