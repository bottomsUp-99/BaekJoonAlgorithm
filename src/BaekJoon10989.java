import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class BaekJoon10989
{
    public static void main(String[] args) throws IOException {
        int[] cnt = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())] ++;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < 10001; i++){
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
