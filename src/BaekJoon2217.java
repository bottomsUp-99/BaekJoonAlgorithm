import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2217
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] rope = new int[N];
        for (int i = 0 ; i < N ; i++){
            rope[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(rope);
        int max = 0;
        for (int j = 0 ; j < N ; j++){
            rope[j] = rope[j]*(N-1);
            if (max < rope[j]){
                max = rope[j];
            }
        }
        System.out.println(max);
    }
}