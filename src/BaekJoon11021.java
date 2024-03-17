import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon11021
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb= new StringBuilder();
        for (int i = 1; i <= N ; i++){
            st = new StringTokenizer(br.readLine());
            sb.append("Case #").append(i).append(": ");
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
