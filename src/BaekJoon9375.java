import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon9375
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T -- > 0) {
            HashMap<String, Integer> dressCode = new HashMap<>();
            int N = Integer.parseInt(br.readLine());
            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();
                String type = st.nextToken();
                if (dressCode.containsKey(type)) {
                    dressCode.put(type, dressCode.get(type) + 1);
                }
                else {
                    dressCode.put(type, 1);
                }
            }
            int ans = 1;
            for (int value : dressCode.values()) {
                ans *= (value + 1);
            }
            sb.append(ans - 1).append('\n');
        }
        System.out.println(sb);
    }
}