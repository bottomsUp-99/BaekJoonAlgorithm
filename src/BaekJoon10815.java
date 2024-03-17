import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon10815
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> sg = new HashMap<>();
        for (int i = 0 ; i < N ; i++){
            sg.put(st.nextToken(), 0);
        }
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int j = 0 ; j < M ; j++){
            if (sg.get(st.nextToken()) != null){
                sb.append("1").append(' ');
            } else {
                sb.append("0").append(' ');
            }
        }
        //2217
        System.out.println(sb);
    }
}
