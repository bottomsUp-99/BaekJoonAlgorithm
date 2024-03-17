import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoon14425
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> nlst = new HashMap<>();
        for (int i = 0 ; i < N ; i++){
            nlst.put(br.readLine(), 0);
        }
        int count = 0;
        for (int j = 0 ; j < M ; j++){
            if (nlst.containsKey(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
    }
}