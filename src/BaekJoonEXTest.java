import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BaekJoonEXTest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> QS = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        int[] type = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < N ; i++){
            type[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < M ; i++){
            st = new StringTokenizer(br.readLine());
            QS.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
    }
}
