import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon2960
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        primeNumber(N,K);
    }

    static void primeNumber(int n, int k) {
        int[] arr = new int[n+1];

        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= n; i++) {
            if (arr[i] == 0){
                continue;
            }
            for (int j = i; j <= n; j+=i) {
                if (arr[j] != 0) {
                    arr[j] = 0;
                    k--;
                    if (k == 0) {
                        System.out.print(j);
                        return;
                    }
                }
            }
        }
    }
}
