import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon1620
{
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> pocket = new HashMap<>();
        String[] arr = new String[N + 1];
        for (int i = 1 ; i <= N ; i++) {
            String s = br.readLine();
            pocket.put(s, i);
            arr[i] = s;
        }
        for (int i = 0 ; i < M ; i++) {
            String s = br.readLine();
            if (Character.isDigit(s.charAt(0))) {
                sb.append(arr[Integer.parseInt(s)]);
            } else {
                sb.append(pocket.get(s));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
