import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1978
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        int total = 0;
        for (int i = 0 ; i < N ; i++){
            int n = Integer.parseInt(str.nextToken());
            int count = 0;
            for (int j = 1 ; j <= n ; j++){
                if (n % j == 0){
                    count++;
                }
            }
            if (count == 2){
                total++;
            }
        }
        System.out.println(total);
    }
}
