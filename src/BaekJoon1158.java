import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BaekJoon1158
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        Queue<Integer> yoyo = new ArrayDeque<>();
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        for (int i = 0 ; i < N ; i++){
            yoyo.offer(i+1);
        }
        sb.append("<");
        while(yoyo.size() != 1) {
            for (int i = 0; i < K - 1; i++) {
                yoyo.offer(yoyo.poll());
            }
            sb.append(yoyo.poll()).append(", ");
        }
        sb.append(yoyo.poll()).append(">");
        System.out.println(sb);
    }
}
