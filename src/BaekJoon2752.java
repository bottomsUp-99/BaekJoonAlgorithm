import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon2752
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] list = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i < 3 ; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list);
        for (int i : list){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
