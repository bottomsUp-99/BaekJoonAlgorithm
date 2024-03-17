import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11328
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i=0; i<N; i++) {
            int[] alpa = new int[26];
            st = new StringTokenizer(br.readLine());
            char[] words1 = st.nextToken().toCharArray();
            char[] words2 = st.nextToken().toCharArray();
            for (char ch : words1) alpa[ch - 97]++;
            for (char ch : words2) alpa[ch - 97]--;
            boolean flag = true;
            for (int j : alpa){
                if (j != 0) flag = false;
            }
            System.out.println(flag ? "Possible" : "Impossible");
        }
    }
}