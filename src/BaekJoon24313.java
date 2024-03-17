import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon24313
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Long a_1 = Long.parseLong(st.nextToken());
        Long a_0 = Long.parseLong(st.nextToken());
        Long c = Long.parseLong(br.readLine());
        Long n_0 = Long.parseLong(br.readLine());
        int result = ((a_1 * n_0 + a_0) <= c * n_0) && (c >= a_1)? 1:0;
        System.out.println(result);
    }
}
