import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon19583
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
//        String E = st.nextToken();
//        String Q = st.nextToken();
        int sh = Integer.parseInt(Arrays.toString(S.split(":")));
        System.out.println(sh);
        // 모르겠어염....
    }
}
